package translator;

public class Calculator {

    public static byte[] equalByElement(double[] x, double y){
        byte[] res = new byte[x.length];
        for (int j = 0; j < x.length; j++) {
            if(x[j] == y)
                res[j] = 1;
        }
        return res;
    }

    public static byte[] notEqualByElement(double[] x, double y){
        byte[] res = new byte[x.length];
        for (int j = 0; j < x.length; j++) {
            if(x[j] != y)
                res[j] = 1;
        }
        return res;
    }

    public static byte[] lessByElement(double[] x, double y){
        byte[] res = new byte[x.length];
        for (int j = 0; j < x.length; j++) {
            if(x[j] < y)
                res[j] = 1;
        }
        return res;
    }

    public static byte[] moreByElement(double[] x, double y){
        byte[] res = new byte[x.length];
        for (int j = 0; j < x.length; j++) {
            if(x[j] > y)
                res[j] = 1;
        }
        return res;
    }

    public static byte[] lessEqualByElement(double[] x, double y){
        byte[] res = new byte[x.length];
        for (int j = 0; j < x.length; j++) {
            if(x[j] <= y)
                res[j] = 1;
        }
        return res;
    }

    public static byte[] moreEqualByElement(double[] x, double y){
        byte[] res = new byte[x.length];
        for (int j = 0; j < x.length; j++) {
            if(x[j] >= y)
                res[j] = 1;
        }
        return res;
    }

    public static byte[] xorByElement(byte[] x, byte[] y){
        byte[] res = new byte[x.length];
        for (int j = 0; j < x.length; j++) {
            if(x[j] != y[j])
                res[j] = 1;
        }
        return res;
    }

    public static byte[] xorByElement(byte[] x, boolean y){
        byte[] res = new byte[x.length];
        for (int j = 0; j < x.length; j++) {
            if((x[j] == 1) ^ y)
                res[j] = 1;
        }
        return res;
    }

    public static byte[] orByElement(byte[] x, byte[] y){
        byte[] res = new byte[x.length];
        for (int j = 0; j < x.length; j++) {
            if(x[j] == 1 || y[j] == 1)
                res[j] = 1;
        }
        return res;
    }

    public static byte[] orByElement(byte[] x, boolean y){
        byte[] res = new byte[x.length];
        for (int j = 0; j < x.length; j++) {
            if((x[j] == 1) | y)
                res[j] = 1;
        }
        return res;
    }

    public static byte[] andByElement(byte[] x, byte[] y){
        byte[] res = new byte[x.length];
        for (int j = 0; j < x.length; j++) {
            if(x[j] != 0 && y[j] != 0)
                res[j] = 1;
        }
        return res;
    }

    public static byte[] andByElement(byte[] x, boolean y){
        byte[] res = new byte[x.length];
        for (int j = 0; j < x.length; j++) {
            if((x[j] == 1) & y)
                res[j] = 1;
        }
        return res;
    }

    public static byte[] equalByElement(double[] x, double[] y){
        byte[] res = new byte[x.length];
        for (int j = 0; j < x.length; j++) {
            if(x[j] == y[j])
                res[j] = 1;
        }
        return res;
    }

    public static byte[] notEqualByElement(double[] x, double[] y){
        byte[] res = new byte[x.length];
        for (int j = 0; j < x.length; j++) {
            if(x[j] != y[j])
                res[j] = 1;
        }
        return res;
    }

    public static byte[] lessByElement(double[] x, double[] y){
        byte[] res = new byte[x.length];
        for (int j = 0; j < x.length; j++) {
            if(x[j] < y[j])
                res[j] = 1;
        }
        return res;
    }

    public static byte[] moreByElement(double[] x, double[] y){
        byte[] res = new byte[x.length];
        for (int j = 0; j < x.length; j++) {
            if(x[j] > y[j])
                res[j] = 1;
        }
        return res;
    }

    public static byte[] lessEqualByElement(double[] x, double[] y){
        byte[] res = new byte[x.length];
        for (int j = 0; j < x.length; j++) {
            if(x[j] <= y[j])
                res[j] = 1;
        }
        return res;
    }

    public static byte[] moreEqualByElement(double[] x, double[] y){
        byte[] res = new byte[x.length];
        for (int j = 0; j < x.length; j++) {
            if(x[j] >= y[j])
                res[j] = 1;
        }
        return res;
    }

    public static boolean equal(double[] x, double[] y){
        for (int j = 0; j < x.length; j++) {
            if(x[j] != y[j])
                return false;
        }
        return true;
    }

    public static double[] unaryMinus(double[] x) {
        double[] res = new double[x.length];
        for (int j = 0; j < res.length; j++) {
            res[j] = -x[j];
        }
        return res;
    }

    public static byte[] round(byte[] x) {
        return x;
    }

    public static short[] round(short[] x) {
        return x;
    }

    public static int[] round(int[] x) {
        return x;
    }

    public static float[] round(float[] x) {
        float[] res = new float[x.length];
        for (int j = 0; j < res.length; j++) {
            res[j] = (float) Math.round(x[j]);
        }
        return res;
    }

    public static double[] round(double[] x) {
        double[] res = new double[x.length];
        for (int j = 0; j < res.length; j++) {
            res[j] = Math.round(x[j]);
        }
        return res;
    }

    public static byte[] floor(byte[] x) {
        return x;
    }

    public static short[] floor(short[] x) {
        return x;
    }

    public static int[] floor(int[] x) {
        return x;
    }

    public static float[] floor(float[] x) {
        float[] res = new float[x.length];
        for (int j = 0; j < res.length; j++) {
            res[j] = (float) Math.floor(x[j]);
        }
        return res;
    }

    public static double[] floor(double[] x) {
        double[] res = new double[x.length];
        for (int j = 0; j < res.length; j++) {
            res[j] = Math.floor(x[j]);
        }
        return res;
    }

    public static byte[] ceil(byte[] x) {
        return x;
    }

    public static short[] ceil(short[] x) {
        return x;
    }

    public static int[] ceil(int[] x) {
        return x;
    }

    public static float[] ceil(float[] x) {
        float[] res = new float[x.length];
        for (int j = 0; j < res.length; j++) {
            res[j] = (float) Math.ceil(x[j]);
        }
        return res;
    }

    public static double[] ceil(double[] x) {
        double[] res = new double[x.length];
        for (int j = 0; j < res.length; j++) {
            res[j] = Math.ceil(x[j]);
        }
        return res;
    }

    public static double[] abs(double[] x) {
        double[] res = new double[x.length];
        for (int j = 0; j < res.length; j++) {
            res[j] = Math.abs(x[j]);
        }
        return res;
    }

    public static double[] sin(double[] x) {
        double[] res = new double[x.length];
        for (int j = 0; j < res.length; j++) {
            res[j] = Math.sin(x[j]);
        }
        return res;
    }

    public static double[] cos(double[] x) {
        double[] res = new double[x.length];
        for (int j = 0; j < res.length; j++) {
            res[j] = Math.cos(x[j]);
        }
        return res;
    }

    public static double[] tan(double[] x) {
        double[] res = new double[x.length];
        for (int j = 0; j < res.length; j++) {
            res[j] = Math.tan(x[j]);
        }
        return res;
    }

    public static double[] log(double[] x) {
        double[] res = new double[x.length];
        for (int j = 0; j < res.length; j++) {
            res[j] = Math.log(x[j]);
        }
        return res;
    }

    public static double[] exp(double[] x) {
        double[] res = new double[x.length];
        for (int j = 0; j < res.length; j++) {
            res[j] = Math.exp(x[j]);
        }
        return res;
    }

    public static double[] sqrt(double[] x) {
        double[] res = new double[x.length];
        for (int j = 0; j < res.length; j++) {
            res[j] = Math.sqrt(x[j]);
        }
        return res;
    }

    public static double[] plus(double[] x, double[] y) {
        double[] res = new double[x.length];
        for (int j = 0; j < res.length; j++) {
            res[j] = x[j] + y[j];
        }
        return res;
    }

    public static double[] plus(double[] x, double y) {
        double[] res = new double[x.length];
        for (int j = 0; j < res.length; j++) {
            res[j] = x[j] + y;
        }
        return res;
    }

    public static double[] minus(double[] x, double[] y) {
        double[] res = new double[x.length];
        for (int j = 0; j < res.length; j++) {
            res[j] = x[j] - y[j];
        }
        return res;
    }

    public static double[] minus(double[] x, double y) {
        double[] res = new double[x.length];
        for (int j = 0; j < res.length; j++) {
            res[j] = x[j] - y;
        }
        return res;
    }
    public static double[] mult(double[] x, double[] y) {
        double[] res = new double[x.length];
        for (int j = 0; j < res.length; j++) {
            res[j] = x[j] * y[j];
        }
        return res;
    }

    public static double[] mult(double[] x, double y) {
        double[] res = new double[x.length];
        for (int j = 0; j < res.length; j++) {
            res[j] = x[j] * y;
        }
        return res;
    }

    public static double[] div(double[] x, double[] y) {
        double[] res = new double[x.length];
        for (int j = 0; j < res.length; j++) {
            res[j] = x[j] / y[j];
        }
        return res;
    }

    public static double[] div(double[] x, double y) {
        double[] res = new double[x.length];
        for (int j = 0; j < res.length; j++) {
            res[j] = x[j] / y;
        }
        return res;
    }

    public static double sum(double[] x){
        double sum = 0;
        for(int j = 0; j < x.length; j++){
            sum += x[j];
        }
        return sum;
    }

    public static double min(double[] x){
        double min = Double.MAX_VALUE;
        for(int j = 0; j < x.length; j++){
            if(x[j] < min){
                min = x[j];
            }
        }
        return min;
    }

    public static double max(double[] x){
        double max = Double.MIN_VALUE;
        for(int j = 0; j < x.length; j++){
            if(x[j] > max){
                max = x[j];
            }
        }
        return max;
    }
}
