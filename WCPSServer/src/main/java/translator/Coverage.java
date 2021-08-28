package translator;

import org.gdal.gdal.Band;
import org.gdal.gdal.Dataset;
import org.gdal.gdal.Driver;
import org.gdal.gdal.gdal;
import org.gdal.gdalconst.gdalconst;

import java.io.File;

public class Coverage {
    private String fileName;
    private Dataset dataset;
    private String extension;


    public enum BinaryOp {
        Plus, Minus, Mult, Div, And, Or, Xor, Less, More, LessEqual, MoreEqual, Equal, NotEqual;
    }

    public enum UnaryOp {
        Minus, Not, Abs, Round, Ceil, Floor, Sqrt, Log, Exp, Cos, Sin, Tan;
    }

    public Coverage(String fileName) throws Exception {
        this.fileName = fileName;
        this.dataset = getDataset(fileName);
        this.extension = "";
    }

    public Coverage(String fileName, int x, int y, int bands, int type){
        this.fileName = fileName;
        this.dataset = getNewDataset(fileName, x, y, bands, type);
        this.extension = "";
    }

    public Coverage(String fileName, Dataset dataset, String extension){
        this.fileName = fileName;
        this.dataset = dataset;
        this.extension = extension;
    }

    public static Coverage encode(Coverage cov, String driver, String name){
        String[] dInfo = driver.split("/");
        if(dInfo.length > 2){
            throw new IllegalArgumentException("Incorrect driver name!");
        }
        Driver d = gdal.GetDriverByName(dInfo[0]);
        if(d == null){
            throw new IllegalArgumentException(dInfo[0] + " - unknown driver!");
        }
        Dataset dataset = d.CreateCopy(name, cov.getDataset());
        if(dataset == null){
            throw new IllegalArgumentException("Impossible to convert file to " + driver + " format!");
        }
        String ext = "";
        if(dInfo.length > 1){
            ext = dInfo[1];
        }
        return new Coverage(name, dataset, ext);
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public static Coverage merge(Coverage old, Coverage n, Coverage pat, String resName){
        int bands = old.dataset.getRasterCount();
        int xSize = old.dataset.getRasterXSize();
        int ySize = old.dataset.GetRasterYSize();
        int higherType = getHigherType(old.dataset.GetRasterBand(1).getDataType(), n.dataset.GetRasterBand(1).getDataType());
        Coverage res = new Coverage(resName, xSize, ySize, bands, higherType);
        for(int band = 0; band < bands; band++){
            Band band1 = old.dataset.GetRasterBand(band + 1);
            Band band2 = n.dataset.GetRasterBand(band + 1);
            Band band3 = pat.dataset.GetRasterBand(band + 1);
            Band bandRes = res.dataset.GetRasterBand(band + 1);

            for (int i = 0; i < ySize; i++){
                double[] read1 = new double[xSize];
                double[] read2 = new double[xSize];
                byte[] read3 = new byte[xSize];
                band1.ReadRaster(0, i, xSize, 1, read1);
                band2.ReadRaster(0, i, xSize, 1, read2);
                band3.ReadRaster(0, i, xSize, 1, read3);
                for (int j = 0; j < xSize; j++){
                    if(read3[j] == 1){
                        read1[j] = read2[j];
                    }
                }
                bandRes.WriteRaster(0, i, xSize, 1, read1);
            }
        }
        return res;
    }

    public static Coverage merge(int xSize, int ySize, double[] n, String resName){
        Coverage res = new Coverage(resName, xSize, ySize, n.length, gdalconst.GDT_Float64);
        for(int band = 0; band < n.length; band++){
            Band bandRes = res.dataset.GetRasterBand(band + 1);

            for (int i = 0; i < ySize; i++){
                double[] read1 = new double[xSize];
                for (int j = 0; j < xSize; j++){
                    read1[j] = n[band];
                }
                bandRes.WriteRaster(0, i, xSize, 1, read1);
            }
        }
        return res;
    }

    public static Coverage merge(Coverage old, double[] n, Coverage pat, String resName){
        int xSize = old.dataset.getRasterXSize();
        int ySize = old.dataset.GetRasterYSize();
        Coverage res = new Coverage(resName, xSize, ySize, n.length, old.dataset.GetRasterBand(1).getDataType());
        Band band3 = pat.dataset.GetRasterBand(1);
        for(int band = 0; band < n.length; band++){
            Band bandRes = res.dataset.GetRasterBand(band + 1);
            Band band1 = old.dataset.GetRasterBand(band + 1);
            for (int i = 0; i < ySize; i++){
                double[] read1 = new double[xSize];
                byte[] read3 = new byte[xSize];
                band1.ReadRaster(0, i, xSize, 1, read1);
                band3.ReadRaster(0, i, xSize, 1, read3);
                for (int j = 0; j < xSize; j++){
                    if(read3[j] == 1){
                        read1[j] = n[band];
                    }
                }
                bandRes.WriteRaster(0, i, xSize, 1, read1);
            }
        }
        return res;
    }

    public static int count(Coverage a){
        int bands = a.dataset.getRasterCount();
        int xSize = a.dataset.getRasterXSize();
        int ySize = a.dataset.GetRasterYSize();
        int res = 0;
        for(int band = 0; band < bands; band++){
            Band band1 = a.dataset.GetRasterBand(band + 1);
            if(band1.getDataType() != gdalconst.GDT_Byte ){
                throw new IllegalArgumentException("Only bool type should be in or, xor, and operations!");
            }
            for (int i = 0; i < ySize; i++){
                double[] read1 = new double[xSize];
                band1.ReadRaster(0, i, xSize, 1, read1);
                for (int j = 0; j < xSize; j++){
                    if(read1[j] > 0){
                        res++;
                    }
                }
            }
        }
        return res;
    }

    public static Coverage boolUnaryOperation(Coverage a, String resName, UnaryOp op){
        int bands = a.dataset.getRasterCount();
        int xSize = a.dataset.getRasterXSize();
        int ySize = a.dataset.GetRasterYSize();
        Coverage res = new Coverage(resName, xSize, ySize, bands, gdalconst.GDT_Byte);
        for(int band = 0; band < bands; band++){
            Band band1 = a.dataset.GetRasterBand(band + 1);
            if(band1.getDataType() != gdalconst.GDT_Byte && band1.getDataType() != gdalconst.GDT_Int16 && band1.getDataType() != gdalconst.GDT_Int32 &&
                    band1.getDataType() != gdalconst.GDT_UInt16 && band1.getDataType() != gdalconst.GDT_UInt32){
                throw new IllegalArgumentException("Only integer type should be in bitwise operations!");
            }
            Band bandRes = res.dataset.GetRasterBand(band + 1);
            for (int i = 0; i < ySize; i++){
                int[] read1 = new int[xSize];
                band1.ReadRaster(0, i, xSize, 1, read1);
                switch (op){
                    case Not: for (int j = 0; j < xSize; j++){
                            if(read1[j] > 0){
                                read1[j] = 0;
                            }else {
                                read1[j] = 1;
                            }
                        }
                        break;
                    default:
                        throw new IllegalArgumentException("Incorrect operation type!");
                }
                bandRes.WriteRaster(0, i, xSize, 1, read1);
            }
        }
        return res;
    }

    public static Coverage boolBinaryOperation(Coverage a, double b, String resName, BinaryOp op){
        int bands = a.dataset.getRasterCount();
        int xSize = a.dataset.getRasterXSize();
        int ySize = a.dataset.GetRasterYSize();
        Coverage res = new Coverage(resName, xSize, ySize, bands, gdalconst.GDT_Byte);
        for(int band = 0; band < bands; band++){
            Band band1 = a.dataset.GetRasterBand(band + 1);
            Band bandRes = res.dataset.GetRasterBand(band + 1);

            for (int i = 0; i < ySize; i++){
                double[] read1 = new double[xSize];
                band1.ReadRaster(0, i, xSize, 1, read1);
                byte[] readRes;
                switch (op){
                    case Equal: readRes = Calculator.equalByElement(read1, b);
                        break;
                    case NotEqual: readRes = Calculator.notEqualByElement(read1, b);
                        break;
                    case Less: readRes = Calculator.lessByElement(read1, b);
                        break;
                    case More: readRes = Calculator.moreByElement(read1, b);
                        break;
                    case LessEqual: readRes = Calculator.lessEqualByElement(read1, b);
                        break;
                    case MoreEqual: readRes = Calculator.moreEqualByElement(read1, b);
                        break;
                    default:
                        throw new IllegalArgumentException("Incorrect operation type!");
                }
                bandRes.WriteRaster(0, i, xSize, 1, readRes);
            }
        }
        return res;
    }

    public static Coverage boolBinaryOperation(Coverage a, boolean b, String resName, BinaryOp op){
        int bands = a.dataset.getRasterCount();
        int xSize = a.dataset.getRasterXSize();
        int ySize = a.dataset.GetRasterYSize();
        if(a.getDataset().GetRasterBand(1).getDataType() != gdalconst.GDT_Byte ){
            throw new IllegalArgumentException("Only bool type should be in boolean operations!");
        }
        Coverage res = new Coverage(resName, xSize, ySize, bands, gdalconst.GDT_Byte);
        for(int band = 0; band < bands; band++){
            Band band1 = a.dataset.GetRasterBand(band + 1);
            Band bandRes = res.dataset.GetRasterBand(band + 1);
            for (int i = 0; i < ySize; i++){
                byte[] read1 = new byte[xSize];
                band1.ReadRaster(0, i, xSize, 1, read1);
                byte[] readRes;
                switch (op){
                    case And: readRes = Calculator.andByElement(read1, b);
                        break;
                    case Or: readRes = Calculator.orByElement(read1, b);
                        break;
                    case Xor: readRes = Calculator.xorByElement(read1, b);
                        break;
                    default:
                        throw new IllegalArgumentException("Incorrect operation type!");
                }
                bandRes.WriteRaster(0, i, xSize, 1, readRes);
            }
        }
        return res;
    }

    public static Coverage boolBinaryOperation(Coverage a, Coverage b, String resName, BinaryOp op){
        int bands = a.dataset.getRasterCount();
        int xSize = a.dataset.getRasterXSize();
        int ySize = a.dataset.GetRasterYSize();
        checkForCompatible(a, b);
        Coverage res = new Coverage(resName, xSize, ySize, bands, gdalconst.GDT_Byte);
        for(int band = 0; band < bands; band++){
            Band band1 = a.dataset.GetRasterBand(band + 1);
            Band band2 = b.dataset.GetRasterBand(band + 1);
            Band bandRes = res.dataset.GetRasterBand(band + 1);

            for (int i = 0; i < ySize; i++){
                double[] read1 = new double[xSize];
                double[] read2 = new double[xSize];
                byte[] read1b = new byte[xSize];
                byte[] read2b = new byte[xSize];
                if(op == BinaryOp.And || op == BinaryOp.Or || op == BinaryOp.Xor){
                    if(band1.getDataType() != gdalconst.GDT_Byte || band2.getDataType() != gdalconst.GDT_Byte){
                        throw new IllegalArgumentException("Only bool type should be in or, xor, and operations!");
                    }
                    band1.ReadRaster(0, i, xSize, 1, read1b);
                    band2.ReadRaster(0, i, xSize, 1, read2b);
                } else {
                    band1.ReadRaster(0, i, xSize, 1, read1);
                    band2.ReadRaster(0, i, xSize, 1, read2);
                }
                byte[] readRes;
                switch (op){
                    case Equal: readRes = Calculator.equalByElement(read1, read2);
                        break;
                    case NotEqual: readRes = Calculator.notEqualByElement(read1, read2);
                        break;
                    case Less: readRes = Calculator.lessByElement(read1, read2);
                        break;
                    case More: readRes = Calculator.moreByElement(read1, read2);
                        break;
                    case LessEqual: readRes = Calculator.lessEqualByElement(read1, read2);
                        break;
                    case MoreEqual: readRes = Calculator.moreEqualByElement(read1, read2);
                        break;
                    case And: readRes = Calculator.andByElement(read1b, read2b);
                        break;
                    case Or: readRes = Calculator.orByElement(read1b, read2b);
                        break;
                    case Xor: readRes = Calculator.xorByElement(read1b, read2b);
                        break;
                    default:
                        throw new IllegalArgumentException("Incorrect operation type!");
                }
                bandRes.WriteRaster(0, i, xSize, 1, readRes);
            }
        }
        return res;
    }

    public static Coverage trim(Coverage a, String resName, int x0, int y0, int xL, int yL, int b0, int bL){
        int bands = a.dataset.getRasterCount();
        int xSize = a.dataset.getRasterXSize();
        int ySize = a.dataset.GetRasterYSize();
        if(xL <= x0 || yL <= y0 || bL <= b0){
            throw new IllegalArgumentException("Incorrect interval!");
        }
        int xNew = xL - x0;
        int yNew = yL - y0;
        int bNew = bL - b0;
        Coverage res = new Coverage(resName, xNew, yNew, bNew, a.dataset.GetRasterBand(1).getDataType());
        for(int band = 0, oldBand = b0; band < bNew; band++, oldBand++){
            if(oldBand >= 0 && oldBand < bands){
                Band band1 = a.dataset.GetRasterBand(oldBand + 1);
                Band bandRes = res.dataset.GetRasterBand(band + 1);
                for (int i = 0, iOld = y0; i < yNew; i++, iOld++){
                    double[] read1 = new double[xNew];
                    if(iOld >= 0 && iOld < ySize){
                        if(x0 < xSize && xL > 0){
                            double[] read2 = new double[xSize];
                            band1.ReadRaster(0, iOld, xSize, 1, read2);
                            for(int k = 0, kOld = x0; k < xNew; k++, kOld++){
                                if(kOld >= 0 && kOld < xSize){
                                    read1[k] = read2[kOld];
                                }
                            }
                        }
                        bandRes.WriteRaster(0, i, xNew, 1, read1);
                    } else {
                        bandRes.WriteRaster(0, i, xNew, 1, read1);
                    }
                }
            }else {
                Band bandRes = res.dataset.GetRasterBand(band + 1);
                for (int i = 0; i < yNew; i++){
                    double[] read1 = new double[xNew];
                    bandRes.WriteRaster(0, i, xNew, 1, read1);
                }
            }
        }
        return res;
    }

    public static Coverage cast(Coverage a, String resName, int type){
        int bands = a.dataset.getRasterCount();
        int xSize = a.dataset.getRasterXSize();
        int ySize = a.dataset.GetRasterYSize();
        Coverage res = new Coverage(resName, xSize, ySize, bands, type);
        for(int band = 0; band < bands; band++){
            Band band1 = a.dataset.GetRasterBand(band + 1);
            Band bandRes = res.dataset.GetRasterBand(band + 1);
            for (int i = 0; i < ySize; i++){
                double[] read1 = new double[xSize];
                band1.ReadRaster(0, i, xSize, 1, read1);
                bandRes.WriteRaster(0, i, xSize, 1, read1);
            }
        }
        return res;
    }

    public static Coverage unaryOperation(Coverage a, String resName, UnaryOp op){
        int bands = a.dataset.getRasterCount();
        int xSize = a.dataset.getRasterXSize();
        int ySize = a.dataset.GetRasterYSize();
        int type;
        switch (op) {
            case Minus:
            case Abs:
            case Round:
            case Ceil:
            case Floor:
                type = a.dataset.GetRasterBand(1).getDataType();
                break;
            case Sqrt:
            case Log:
            case Exp:
            case Sin:
            case Cos:
            case Tan:
                type = gdalconst.GDT_Float64;
                break;
            default:
                throw new IllegalArgumentException("Incorrect operation type!");
        }
        Coverage res = new Coverage(resName, xSize, ySize, bands, type);
        for(int band = 0; band < bands; band++){
            Band band1 = a.dataset.GetRasterBand(band + 1);
            Band bandRes = res.dataset.GetRasterBand(band + 1);
            for (int i = 0; i < ySize; i++){
                double[] read1 = new double[xSize];
                band1.ReadRaster(0, i, xSize, 1, read1);
                double[] readRes;
                switch (op){
                    case Minus: readRes = Calculator.unaryMinus(read1);
                        break;
                    case Abs: readRes = Calculator.abs(read1);
                        break;
                    case Round: readRes = Calculator.round(read1);
                        break;
                    case Ceil: readRes = Calculator.ceil(read1);
                        break;
                    case Floor: readRes = Calculator.floor(read1);
                        break;
                    case Sqrt: readRes = Calculator.sqrt(read1);
                        break;
                    case Log: readRes = Calculator.log(read1);
                        break;
                    case Exp: readRes = Calculator.exp(read1);
                        break;
                    case Sin: readRes = Calculator.sin(read1);
                        break;
                    case Cos: readRes = Calculator.cos(read1);
                        break;
                    case Tan: readRes = Calculator.tan(read1);
                        break;
                    default:
                        throw new IllegalArgumentException("Incorrect operation type!");
                }
                bandRes.WriteRaster(0, i, xSize, 1, readRes);
            }
        }
        return res;
    }

    public static Coverage binaryOperation(Coverage a, double b, int type, String resName, BinaryOp op){
        int bands = a.dataset.getRasterCount();
        int xSize = a.dataset.getRasterXSize();
        int ySize = a.dataset.GetRasterYSize();
        int higherType = getHigherType(a.dataset.GetRasterBand(1).getDataType(), type);
        Coverage res = new Coverage(resName, xSize, ySize, bands, higherType);
        for(int band = 0; band < bands; band++){
            Band band1 = a.dataset.GetRasterBand(band + 1);
            Band bandRes = res.dataset.GetRasterBand(band + 1);
            for (int i = 0; i < ySize; i++){
                double[] read1 = new double[xSize];
                band1.ReadRaster(0, i, xSize, 1, read1);
                double[] readRes;
                switch (op){
                    case Plus: readRes = Calculator.plus(read1, b);
                        break;
                    case Minus: readRes = Calculator.minus(read1, b);
                        break;
                    case Mult: readRes = Calculator.mult(read1, b);
                        break;
                    case Div: readRes = Calculator.div(read1, b);
                        break;
                    default:
                        throw new IllegalArgumentException("Incorrect operation type!");
                }
                bandRes.WriteRaster(0, i, xSize, 1, readRes);
            }
        }
        return res;
    }

    public static Coverage binaryOperation(Coverage a, Coverage b, String resName, BinaryOp op){
        int bands = a.dataset.getRasterCount();
        int xSize = a.dataset.getRasterXSize();
        int ySize = a.dataset.GetRasterYSize();
        checkForCompatible(a, b);
        int higherType = getHigherType(a.dataset.GetRasterBand(1).getDataType(), b.dataset.GetRasterBand(1).getDataType());
        Coverage res = new Coverage(resName, xSize, ySize, bands, higherType);
        for(int band = 0; band < bands; band++){
            Band band1 = a.dataset.GetRasterBand(band + 1);
            Band band2 = b.dataset.GetRasterBand(band + 1);
            Band bandRes = res.dataset.GetRasterBand(band + 1);

            for (int i = 0; i < ySize; i++){

                double[] read1 = new double[xSize];
                double[] read2 = new double[xSize];
                band1.ReadRaster(0, i, xSize, 1, read1);
                band2.ReadRaster(0, i, xSize, 1, read2);
                double[] readRes;
                switch (op){
                    case Plus: readRes = Calculator.plus(read1, read2);
                        break;
                    case Minus: readRes = Calculator.minus(read1, read2);
                        break;
                    case Mult: readRes = Calculator.mult(read1, read2);
                        break;
                    case Div: readRes = Calculator.div(read1, read2);
                        break;
                    default:
                        throw new IllegalArgumentException("Incorrect operation type!");
                }
                bandRes.WriteRaster(0, i, xSize, 1, readRes);
            }
        }
        return res;
    }

    public static boolean binaryOperation(Coverage a, Coverage b, BinaryOp op){
        int bands = a.dataset.getRasterCount();
        int xSize = a.dataset.getRasterXSize();
        int ySize = a.dataset.GetRasterYSize();
        checkForCompatible(a, b);
        for(int band = 0; band < bands; band++){
            Band band1 = a.dataset.GetRasterBand(band + 1);
            Band band2 = b.dataset.GetRasterBand(band + 1);

            for (int i = 0; i < ySize; i++){

                double[] read1 = new double[xSize];
                double[] read2 = new double[xSize];
                band1.ReadRaster(0, i, xSize, 1, read1);
                band2.ReadRaster(0, i, xSize, 1, read2);
                switch (op){
                    case Equal: if(!Calculator.equal(read1, read2)) return false;
                        break;
                    case NotEqual: if(!Calculator.equal(read1, read2)) return true;
                        break;
                    default: throw new IllegalArgumentException("Incorrect operation type!");
                }
            }
        }
        switch (op){
            case Equal: return true;
            case NotEqual: return false;
            default: throw new IllegalArgumentException("Incorrect operation type!");
        }
    }

    public static double sum(Coverage a){
        int bands = a.dataset.getRasterCount();
        int xSize = a.dataset.getRasterXSize();
        int ySize = a.dataset.GetRasterYSize();
        double res = 0;
        for(int band = 0; band < bands; band++){
            Band band1 = a.dataset.GetRasterBand(band + 1);
            for (int i = 0; i < ySize; i++){
                double[] read1 = new double[xSize];
                band1.ReadRaster(0, i, xSize, 1, read1);
                res += Calculator.sum(read1);
            }
        }
        return res;
    }

    public static double avg(Coverage a){
        int bands = a.dataset.getRasterCount();
        int xSize = a.dataset.getRasterXSize();
        int ySize = a.dataset.GetRasterYSize();
        return sum(a) / (xSize * ySize * bands);
    }

    public static double min(Coverage a){
        int bands = a.dataset.getRasterCount();
        int xSize = a.dataset.getRasterXSize();
        int ySize = a.dataset.GetRasterYSize();
        double res = Double.MAX_VALUE;
        for(int band = 0; band < bands; band++){
            Band band1 = a.dataset.GetRasterBand(band + 1);
            for (int i = 0; i < ySize; i++){
                double[] read1 = new double[xSize];
                band1.ReadRaster(0, i, xSize, 1, read1);
                double r = Calculator.min(read1);
                if(r < res){
                    res = r;
                }
            }
        }
        return res;
    }

    public static double max(Coverage a){
        int bands = a.dataset.getRasterCount();
        int xSize = a.dataset.getRasterXSize();
        int ySize = a.dataset.GetRasterYSize();
        double res = Double.MIN_VALUE;
        for(int band = 0; band < bands; band++){
            Band band1 = a.dataset.GetRasterBand(band + 1);
            for (int i = 0; i < ySize; i++){
                double[] read1 = new double[xSize];
                band1.ReadRaster(0, i, xSize, 1, read1);
                double r = Calculator.max(read1);
                if(r > res){
                    res = r;
                }
            }
        }
        return res;
    }

    public Dataset getDataset() {
        return dataset;
    }

    public String getCoverageName() {
        return fileName;
    }

    public void delete(){
        dataset.delete();
        File file = new File(fileName);
        file.delete();
    }

    public void deleteDataset(){
        dataset.delete();
    }

    private static void checkForCompatible(Coverage a, Coverage b){
        if(a.dataset.GetRasterCount() != b.dataset.GetRasterCount()){
            throw new IllegalArgumentException("Coverages raster counts is not equal!");
        }

        if(a.dataset.GetRasterXSize() != b.dataset.GetRasterXSize()){
            throw new IllegalArgumentException("Coverages X size is not equal!");
        }

        if(a.dataset.GetRasterYSize() != b.dataset.GetRasterYSize()){
            throw new IllegalArgumentException("Coverages Y size is not equal!");
        }
    }

    private Dataset getDataset(String name) throws Exception {
        Dataset dataset = null;
        try{
            dataset = gdal.Open(name, gdalconst.GA_ReadOnly);
            if(dataset == null){
                throw new NullPointerException("Can't to open data " + name + "!");
            }
        }catch (Exception e){
            throw new Exception("Can't to open data " + name + "!", e);
        }
        return dataset;
    }

    private Dataset getNewDataset(String name, int x, int y, int bands, int type){
        Driver driver = gdal.GetDriverByName("GTIFF");
        return driver.Create(name, x, y, bands, type);
    }

    private static int getHigherType(int type1, int type2){
        if(type1 == gdalconst.GDT_Float64 || type2 == gdalconst.GDT_Float64){
            return gdalconst.GDT_Float64;
        } else if(type1 == gdalconst.GDT_Float32 || type2 == gdalconst.GDT_Float32){
            return gdalconst.GDT_Float32;
        }else if(type1 == gdalconst.GDT_Int32 || type2 == gdalconst.GDT_Int32){
            return gdalconst.GDT_Int32;
        }else if(type1 == gdalconst.GDT_UInt32 || type2 == gdalconst.GDT_UInt32){
            return gdalconst.GDT_UInt32;
        }else if(type1 == gdalconst.GDT_Int16 || type2 == gdalconst.GDT_Int16){
            return gdalconst.GDT_Int16;
        }else if(type1 == gdalconst.GDT_UInt16 || type2 == gdalconst.GDT_UInt16){
            return gdalconst.GDT_UInt16;
        }else if(type1 == gdalconst.GDT_Byte || type2 == gdalconst.GDT_Byte){
            return gdalconst.GDT_Byte;
        }else {
            return gdalconst.GDT_Unknown;
        }
    }
}
