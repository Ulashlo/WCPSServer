package translator;

import org.gdal.gdalconst.gdalconst;

import java.util.LinkedList;

public class Translator {
    private final String key;
    private Integer k;
    private LinkedList<Coverage> additionalCoverages;

    public Translator(String key) {
        this.key = key;
        k = 0;
        additionalCoverages = new LinkedList<>();
    }

    public Coverage switchOp(double[] def, Object[]... mas){
        Coverage con = (Coverage) mas[0][0];

        int x = con.getDataset().getRasterXSize();
        int y = con.getDataset().getRasterYSize();
        int b = con.getDataset().GetRasterCount();

        if(b > 1){
            throw new NotImplementedException("Light constructor doesn't support coverages with a more then 1 layers!");
        }

        LinkedList<Coverage> conds = new LinkedList<>();
        LinkedList<double[]> covs = new LinkedList<>();

        for(Object[] m : mas){
            Coverage c = (Coverage) m[0];
            double[] v = (double[]) m[1];
            if(c.getDataset().GetRasterCount() != b ){
                throw new IllegalArgumentException("Coverages raster counts is not equal!");
            }

            if(c.getDataset().GetRasterXSize() != x ){
                throw new IllegalArgumentException("Coverages X size is not equal!");
            }

            if(c.getDataset().GetRasterYSize() != y ){
                throw new IllegalArgumentException("Coverages Y size is not equal!");
            }
            conds.add(c);
            covs.add(v);
        }

        Coverage res = Coverage.merge(x, y, def, key + k.toString());
        k++;
        additionalCoverages.add(res);

        for(int i = conds.size() - 1; i >= 0; i--){
            res = Coverage.merge(res, covs.get(i), conds.get(i), key + k.toString());
            k++;
            additionalCoverages.add(res);
        }

        return res;
    }

    public Coverage switchOp(Coverage def, Object[]... mas){
        Coverage cond = (Coverage) mas[0][0];

        int x = cond.getDataset().getRasterXSize();
        int y = cond.getDataset().getRasterYSize();
        int b = cond.getDataset().GetRasterCount();
        LinkedList<Coverage> conds = new LinkedList<>();
        LinkedList<Coverage> covs = new LinkedList<>();
        LinkedList<LinkedList<Double>> dobs = new LinkedList<>();


        for(Object[] m : mas){
            Coverage c = (Coverage) m[0];
            Coverage v = (Coverage) m[1];
            if(c.getDataset().GetRasterCount() != b || v.getDataset().GetRasterCount() != b){
                throw new IllegalArgumentException("Coverages raster counts is not equal!");
            }

            if(c.getDataset().GetRasterXSize() != x || v.getDataset().GetRasterXSize() != x){
                throw new IllegalArgumentException("Coverages X size is not equal!");
            }

            if(c.getDataset().GetRasterYSize() != y || v.getDataset().GetRasterYSize() != y){
                throw new IllegalArgumentException("Coverages Y size is not equal!");
            }
            conds.add(c);
            covs.add(v);
        }
        Coverage res = null;
        if(def == null){
            res = new Coverage(key + k.toString(), x, y, b, gdalconst.GDT_Byte);
            k++;
            additionalCoverages.add(res);
        }else {
            if(def.getDataset().GetRasterCount() != b){
                throw new IllegalArgumentException("Coverages raster counts is not equal!");
            }

            if(def.getDataset().GetRasterXSize() != x){
                throw new IllegalArgumentException("Coverages X size is not equal!");
            }

            if(def.getDataset().GetRasterYSize() != y){
                throw new IllegalArgumentException("Coverages Y size is not equal!");
            }
            res = def;
        }

        for(int i = conds.size() - 1; i >= 0; i--){
            res = Coverage.merge(res, covs.get(i), conds.get(i), key + k.toString());
            k++;
            additionalCoverages.add(res);
        }

        return res;
    }

    public Coverage trim(Coverage a, int x0, int y0, int xL, int yL, int b0, int bL){
        if(xL == Integer.MAX_VALUE){
            xL = a.getDataset().GetRasterXSize() - 1;
        }
        if(yL == Integer.MAX_VALUE){
            yL = a.getDataset().GetRasterYSize() - 1;
        }
        if(bL == Integer.MAX_VALUE){
            bL = a.getDataset().GetRasterCount() - 1;
        }
        Coverage result = Coverage.trim(a, key + k.toString(), x0, y0, xL + 1, yL + 1, b0, bL + 1);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public boolean equal(boolean a, boolean b){
        return a == b;
    }

    public boolean notEqual(boolean a, boolean b){
        return a != b;
    }

    public Coverage not(Coverage a){
        Coverage result = Coverage.boolUnaryOperation(a, key + k.toString(), Coverage.UnaryOp.Not);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public boolean not(boolean a){
        return !a;
    }

    public boolean and(boolean a, boolean b){
        return a & b;
    }

    public boolean or(boolean a, boolean b){
        return a | b;
    }

    public boolean xor(boolean a, boolean b){
        return a ^ b;
    }

    public Coverage and(Coverage a, boolean b){
        Coverage result = Coverage.boolBinaryOperation(a, b, key + k.toString(), Coverage.BinaryOp.And);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage and(boolean b, Coverage a){
        return and(a, b);
    }

    public Coverage or(Coverage a, boolean b){
        Coverage result = Coverage.boolBinaryOperation(a, b, key + k.toString(), Coverage.BinaryOp.Or);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage or(boolean b, Coverage a){
        return or(a, b);
    }


    public Coverage xor(Coverage a, boolean b){
        Coverage result = Coverage.boolBinaryOperation(a, b, key + k.toString(), Coverage.BinaryOp.Xor);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage xor(boolean b, Coverage a){
        return xor(a, b);
    }


    public Coverage and(Coverage a, Coverage b){
        Coverage result = Coverage.boolBinaryOperation(a, b, key + k.toString(), Coverage.BinaryOp.And);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage or(Coverage a, Coverage b){
        Coverage result = Coverage.boolBinaryOperation(a, b, key + k.toString(), Coverage.BinaryOp.Or);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage xor(Coverage a, Coverage b){
        Coverage result = Coverage.boolBinaryOperation(a, b, key + k.toString(), Coverage.BinaryOp.Xor);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage equal(double a, Coverage b){
        return equal(b, a);
    }

    public Coverage notEqual(double a, Coverage b){
        return notEqual(b ,a);
    }

    public Coverage equal(Coverage a, double b){
        Coverage result = Coverage.boolBinaryOperation(a, b, key + k.toString(), Coverage.BinaryOp.Equal);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage notEqual(Coverage a, double b){
        Coverage result =  Coverage.boolBinaryOperation(a, b, key + k.toString(), Coverage.BinaryOp.NotEqual);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage notEqual(Coverage a, boolean b){
        return equal(a, !b);
    }

    public Coverage equal(Coverage a, boolean b){
        if(b){
            return a;
        }else {
            Coverage result =  Coverage.boolUnaryOperation(a, key + k.toString(), Coverage.UnaryOp.Not);
            k++;
            additionalCoverages.add(result);
            return result;
        }
    }

    public boolean equal2(Coverage a, Coverage b){
        return Coverage.binaryOperation(a, b, Coverage.BinaryOp.Equal);
    }

    public Coverage equal(Coverage a, Coverage b){
        Coverage result =  Coverage.boolBinaryOperation(a, b, key + k.toString(), Coverage.BinaryOp.Equal);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public boolean notEqual2(Coverage a, Coverage b){
        return Coverage.binaryOperation(a, b, Coverage.BinaryOp.NotEqual);
    }

    public Coverage notEqual(Coverage a, Coverage b){
        Coverage result =  Coverage.boolBinaryOperation(a, b, key + k.toString(), Coverage.BinaryOp.NotEqual);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage lessThen(double a, Coverage b){
        return moreThen(b, a);
    }

    public Coverage moreThen(double a, Coverage b){
        return lessThen(b, a);
    }

    public Coverage lessEqual(double a, Coverage b){
        return moreEqual(b, a);
    }

    public Coverage moreEqual(double a, Coverage b){
        return lessEqual(b, a);
    }

    public Coverage lessThen(Coverage a, double b){
        Coverage result = Coverage.boolBinaryOperation(a, b, key + k.toString(), Coverage.BinaryOp.Less);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage moreThen(Coverage a, double b){
        Coverage result = Coverage.boolBinaryOperation(a, b, key + k.toString(), Coverage.BinaryOp.More);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage lessEqual(Coverage a, double b){
        Coverage result = Coverage.boolBinaryOperation(a, b, key + k.toString(), Coverage.BinaryOp.LessEqual);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage moreEqual(Coverage a, double b){
        Coverage result = Coverage.boolBinaryOperation(a, b, key + k.toString(), Coverage.BinaryOp.MoreEqual);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage lessThen(Coverage a, Coverage b){
        Coverage result = Coverage.boolBinaryOperation(a, b, key + k.toString(), Coverage.BinaryOp.Less);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage moreThen(Coverage a, Coverage b){
        Coverage result = Coverage.boolBinaryOperation(a, b, key + k.toString(), Coverage.BinaryOp.More);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage lessEqual(Coverage a, Coverage b){
        Coverage result = Coverage.boolBinaryOperation(a, b, key + k.toString(), Coverage.BinaryOp.LessEqual);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage moreEqual(Coverage a, Coverage b){
        Coverage result = Coverage.boolBinaryOperation(a, b, key + k.toString(), Coverage.BinaryOp.MoreEqual);
        k++;
        additionalCoverages.add(result);
        return result;
    }


    public boolean equal(double a, double b){
        return a == b;
    }

    public boolean notEqual(double a, double b){
        return a != b;
    }

    public boolean lessThen(double a, double b){
        return a < b;
    }

    public boolean moreThen(double a, double b){
        return a > b;
    }

    public boolean lessEqual(double a, double b){
        return a <= b;
    }

    public boolean moreEqual(double a, double b){
        return a >= b;
    }

    public Coverage doubleCast(Coverage a){
        Coverage result = Coverage.cast(a, key + k.toString(), gdalconst.GDT_Float64);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage floatCast(Coverage a){
        Coverage result = Coverage.cast(a, key + k.toString(), gdalconst.GDT_Float32);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage unsignedIntCast(Coverage a){
        Coverage result = Coverage.cast(a, key + k.toString(), gdalconst.GDT_UInt32);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage intCast(Coverage a){
        Coverage result = Coverage.cast(a, key + k.toString(), gdalconst.GDT_Int32);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage unsignedShortCast(Coverage a){
        Coverage result = Coverage.cast(a, key + k.toString(), gdalconst.GDT_UInt16);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage shortCast(Coverage a){
        Coverage result = Coverage.cast(a, key + k.toString(), gdalconst.GDT_Int16);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage charCast(Coverage a){
        Coverage result = Coverage.cast(a, key + k.toString(), gdalconst.GDT_Byte);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public double doubleCast(double a){
        return a;
    }

    public double doubleCast(float a){
        return (double) a;
    }

    public double doubleCast(int a){
        return (double) a;
    }

    public double doubleCast(short a){
        return (double) a;
    }

    public double doubleCast(byte a){
        return (double) a;
    }

    public float floatCast(double a){
        return (float) a;
    }

    public float floatCast(float a){
        return a;
    }

    public float floatCast(int a){
        return (float) a;
    }

    public float floatCast(short a){
        return (float) a;
    }

    public float floatCast(byte a){
        return (float) a;
    }

    public int intCast(double a){
        return (int) a;
    }

    public int intCast(float a){
        return (int) a;
    }

    public int intCast(int a){
        return a;
    }

    public int intCast(short a){
        return (int) a;
    }

    public int intCast(byte a){
        return (int) a;
    }

    public short shortCast(double a){
        return (short) a;
    }

    public short shortCast(float a){
        return (short) a;
    }

    public short shortCast(int a){
        return (short) a;
    }

    public short shortCast(short a){
        return a;
    }

    public short shortCast(byte a){
        return (short) a;
    }

    public byte charCast(double a){
        return (byte) a;
    }

    public byte charCast(float a){
        return (byte) a;
    }

    public byte charCast(int a){
        return (byte) a;
    }

    public byte charCast(short a){
        return (byte) a;
    }

    public byte charCast(byte a){
        return a;
    }

    public Coverage unaryMinus(Coverage a) throws Exception {
        Coverage result = Coverage.unaryOperation(a, key + k.toString(), Coverage.UnaryOp.Minus);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public double unaryMinus(double a) throws Exception {
        return -a;
    }

    public float unaryMinus(float a) throws Exception {
        return -a;
    }

    public int unaryMinus(int a) throws Exception {
        return -a;
    }

    public short unaryMinus(short a) throws Exception {
        return (short) -a;
    }

    public byte unaryMinus(byte a) throws Exception {
        return (byte) -a;
    }

    public Coverage sum(Coverage a, Coverage b) throws Exception {
        Coverage result = Coverage.binaryOperation(a, b, key + k.toString(), Coverage.BinaryOp.Plus);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage sum(Coverage a, double b) throws Exception {
        Coverage result = Coverage.binaryOperation(a, b, gdalconst.GDT_Float64, key + k.toString(), Coverage.BinaryOp.Plus);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage sum(double a, Coverage b) throws Exception {
        return sum(b, a);
    }

    public Coverage sum(Coverage a, float b) throws Exception {
        Coverage result = Coverage.binaryOperation(a, b, gdalconst.GDT_Float32, key + k.toString(), Coverage.BinaryOp.Plus);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage sum(float a, Coverage b) throws Exception {
        return sum(b, a);
    }

    public Coverage sum(Coverage a, int b) throws Exception {
        Coverage result = Coverage.binaryOperation(a, b, gdalconst.GDT_Int32, key + k.toString(), Coverage.BinaryOp.Plus);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage sum(int a, Coverage b) throws Exception {
        return sum(b, a);
    }

    public Coverage sum(Coverage a, short b) throws Exception {
        Coverage result = Coverage.binaryOperation(a, b, gdalconst.GDT_Int16, key + k.toString(), Coverage.BinaryOp.Plus);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage sum(short a, Coverage b) throws Exception {
        return sum(b, a);
    }

    public Coverage sum(Coverage a, byte b) throws Exception {
        Coverage result = Coverage.binaryOperation(a, b, gdalconst.GDT_Byte, key + k.toString(), Coverage.BinaryOp.Plus);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage sum(byte a, Coverage b) throws Exception {
        return sum(b, a);
    }

    public double sum(double a, double b) throws Exception {
        return a + b;
    }

    public float sum(float a, float b) throws Exception {
        return a + b;
    }

    public int sum(int a, int b) throws Exception {
        return a + b;
    }

    public short sum(short a, short b) throws Exception {
        return (short) (a + b);
    }

    public byte sum(byte a, byte b) throws Exception {
        return (byte) (a + b);
    }

    public Coverage minus(Coverage a, Coverage b) throws Exception {
        Coverage result = Coverage.binaryOperation(a, b, key + k.toString(), Coverage.BinaryOp.Minus);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage minus(Coverage a, double b) throws Exception {
        Coverage result = Coverage.binaryOperation(a, b, gdalconst.GDT_Float64, key + k.toString(), Coverage.BinaryOp.Minus);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage minus(double a, Coverage b) throws Exception {
        return minus(b, a);
    }

    public Coverage minus(Coverage a, float b) throws Exception {
        Coverage result = Coverage.binaryOperation(a, b, gdalconst.GDT_Float32, key + k.toString(), Coverage.BinaryOp.Minus);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage minus(float a, Coverage b) throws Exception {
        return minus(b, a);
    }

    public Coverage minus(Coverage a, int b) throws Exception {
        Coverage result = Coverage.binaryOperation(a, b, gdalconst.GDT_Int32, key + k.toString(), Coverage.BinaryOp.Minus);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage minus(int a, Coverage b) throws Exception {
        return minus(b, a);
    }

    public Coverage minus(Coverage a, short b) throws Exception {
        Coverage result = Coverage.binaryOperation(a, b, gdalconst.GDT_Int16, key + k.toString(), Coverage.BinaryOp.Minus);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage minus(short a, Coverage b) throws Exception {
        return minus(b, a);
    }

    public Coverage minus(Coverage a, byte b) throws Exception {
        Coverage result = Coverage.binaryOperation(a, b, gdalconst.GDT_Byte, key + k.toString(), Coverage.BinaryOp.Minus);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage minus(byte a, Coverage b) throws Exception {
        return minus(b, a);
    }

    public double minus(double a, double b) throws Exception {
        return a - b;
    }

    public float minus(float a, float b) throws Exception {
        return a - b;
    }

    public int minus(int a, int b) throws Exception {
        return a - b;
    }

    public short minus(short a, short b) throws Exception {
        return (short) (a - b);
    }

    public byte minus(byte a, byte b) throws Exception {
        return (byte) (a - b);
    }

    public Coverage mult(Coverage a, Coverage b) throws Exception {
        Coverage result = Coverage.binaryOperation(a, b, key + k.toString(), Coverage.BinaryOp.Mult);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage mult(Coverage a, double b) throws Exception {
        Coverage result = Coverage.binaryOperation(a, b, gdalconst.GDT_Float64, key + k.toString(), Coverage.BinaryOp.Mult);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage mult(double a, Coverage b) throws Exception {
        return mult(b, a);
    }

    public Coverage mult(Coverage a, float b) throws Exception {
        Coverage result = Coverage.binaryOperation(a, b, gdalconst.GDT_Float32, key + k.toString(), Coverage.BinaryOp.Mult);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage mult(float a, Coverage b) throws Exception {
        return mult(b, a);
    }

    public Coverage mult(Coverage a, int b) throws Exception {
        Coverage result = Coverage.binaryOperation(a, b, gdalconst.GDT_Int32, key + k.toString(), Coverage.BinaryOp.Mult);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage mult(int a, Coverage b) throws Exception {
        return mult(b, a);
    }

    public Coverage mult(Coverage a, short b) throws Exception {
        Coverage result = Coverage.binaryOperation(a, b, gdalconst.GDT_Int16, key + k.toString(), Coverage.BinaryOp.Mult);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage mult(short a, Coverage b) throws Exception {
        return mult(b, a);
    }

    public Coverage mult(Coverage a, byte b) throws Exception {
        Coverage result = Coverage.binaryOperation(a, b, gdalconst.GDT_Byte, key + k.toString(), Coverage.BinaryOp.Mult);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage mult(byte a, Coverage b) throws Exception {
        return mult(b, a);
    }

    public double mult(double a, double b) throws Exception {
        return a * b;
    }

    public float mult(float a, float b) throws Exception {
        return a * b;
    }

    public int mult(int a, int b) throws Exception {
        return a * b;
    }

    public short mult(short a, short b) throws Exception {
        return (short) (a * b);
    }

    public byte mult(byte a, byte b) throws Exception {
        return (byte) (a * b);
    }

    public Coverage div(Coverage a, Coverage b) throws Exception {
        Coverage result = Coverage.binaryOperation(a, b, key + k.toString(), Coverage.BinaryOp.Div);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage div(Coverage a, double b) throws Exception {
        Coverage result = Coverage.binaryOperation(a, b, gdalconst.GDT_Float64, key + k.toString(), Coverage.BinaryOp.Div);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage div(double a, Coverage b) throws Exception {
        return div(b, a);
    }

    public Coverage div(Coverage a, float b) throws Exception {
        Coverage result = Coverage.binaryOperation(a, b, gdalconst.GDT_Float32, key + k.toString(), Coverage.BinaryOp.Div);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage div(float a, Coverage b) throws Exception {
        return div(b, a);
    }

    public Coverage div(Coverage a, int b) throws Exception {
        Coverage result = Coverage.binaryOperation(a, b, gdalconst.GDT_Int32, key + k.toString(), Coverage.BinaryOp.Div);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage div(int a, Coverage b) throws Exception {
        return div(b, a);
    }

    public Coverage div(Coverage a, short b) throws Exception {
        Coverage result = Coverage.binaryOperation(a, b, gdalconst.GDT_Int16, key + k.toString(), Coverage.BinaryOp.Div);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage div(short a, Coverage b) throws Exception {
        return div(b, a);
    }

    public Coverage div(Coverage a, byte b) throws Exception {
        Coverage result = Coverage.binaryOperation(a, b, gdalconst.GDT_Byte, key + k.toString(), Coverage.BinaryOp.Div);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage div(byte a, Coverage b) throws Exception {
        return mult(b, a);
    }

    public double div(double a, double b) throws Exception {
        return a / b;
    }

    public float div(float a, float b) throws Exception {
        return a / b;
    }

    public int div(int a, int b) throws Exception {
        return a / b;
    }

    public short div(short a, short b) throws Exception {
        return (short) (a / b);
    }

    public byte div(byte a, byte b) throws Exception {
        return (byte) (a / b);
    }

    public double sum(Coverage a){
        return Coverage.sum(a);
    }

    public double avg(Coverage a){
        return Coverage.avg(a);
    }

    public double min(Coverage a){
        return Coverage.min(a);
    }

    public double max(Coverage a){
        return Coverage.max(a);
    }

    public int count(Coverage a){
        return Coverage.count(a);
    }

    public byte abs(byte a){
        return (byte) Math.abs(a);
    }

    public short abs(short a){
        return (short) Math.abs(a);
    }

    public int abs(int a){
        return Math.abs(a);
    }

    public float abs(float a){
        return Math.abs(a);
    }

    public double abs(double a){
        return Math.abs(a);
    }

    public Coverage abs(Coverage a) throws Exception {
        Coverage result = Coverage.unaryOperation(a, key + k.toString(), Coverage.UnaryOp.Abs);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public byte round(byte a){
        return a;
    }

    public short round(short a){
        return a;
    }

    public int round(int a){
        return a;
    }

    public float round(float a){
        return Math.round(a);
    }

    public double round(double a){
        return Math.round(a);
    }

    public Coverage round(Coverage a) throws Exception {
        Coverage result = Coverage.unaryOperation(a, key + k.toString(), Coverage.UnaryOp.Round);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public byte ceil(byte a){
        return a;
    }

    public short ceil(short a){
        return a;
    }

    public int ceil(int a){
        return a;
    }

    public float ceil(float a){
        return (float) Math.ceil(a);
    }

    public double ceil(double a){
        return Math.ceil(a);
    }

    public Coverage ceil(Coverage a) throws Exception {
        Coverage result = Coverage.unaryOperation(a, key + k.toString(), Coverage.UnaryOp.Ceil);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public byte floor(byte a){
        return a;
    }

    public short floor(short a){
        return a;
    }

    public int floor(int a){
        return a;
    }

    public float floor(float a){
        return (float) Math.floor(a);
    }

    public double floor(double a){
        return Math.floor(a);
    }

    public Coverage floor(Coverage a) throws Exception {
        Coverage result = Coverage.unaryOperation(a, key + k.toString(), Coverage.UnaryOp.Floor);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public double sqrt(double a){
        return Math.sqrt(a);
    }

    public Coverage sqrt(Coverage a) throws Exception {
        Coverage result = Coverage.unaryOperation(a, key + k.toString(), Coverage.UnaryOp.Sqrt);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public double log(double a){
        return Math.log(a);
    }

    public Coverage log(Coverage a) throws Exception {
        Coverage result = Coverage.unaryOperation(a, key + k.toString(), Coverage.UnaryOp.Log);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public double exp(double a){
        return Math.exp(a);
    }

    public Coverage exp(Coverage a) throws Exception {
        Coverage result = Coverage.unaryOperation(a, key + k.toString(), Coverage.UnaryOp.Exp);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public double sin(double a){
        return Math.sin(a);
    }

    public Coverage sin(Coverage a) throws Exception {
        Coverage result = Coverage.unaryOperation(a, key + k.toString(), Coverage.UnaryOp.Sin);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public double cos(double a){
        return Math.cos(a);
    }

    public Coverage cos(Coverage a) throws Exception {
        Coverage result = Coverage.unaryOperation(a, key + k.toString(), Coverage.UnaryOp.Cos);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public double tan(double a){
        return Math.tan(a);
    }

    public Coverage tan(Coverage a) throws Exception {
        Coverage result = Coverage.unaryOperation(a, key + k.toString(), Coverage.UnaryOp.Tan);
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public Coverage encode(Coverage cov, String driver){
        Coverage result = Coverage.encode(cov, driver, key + k.toString());
        k++;
        additionalCoverages.add(result);
        return result;
    }

    public void deleteAll(){
        int len = additionalCoverages.size();
        for(int i = 0; i < len; i++){
            additionalCoverages.get(i).delete();
        }
    }
}
