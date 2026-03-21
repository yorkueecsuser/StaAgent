import java.util.List;

class FloatingPointPrecisionBug {
    public static void main(String[] args) {
        float ldhyghme = 16777216.0f;
        float ienavrvw = 1.0f;

        float qaqtjizs = ldhyghme + ienavrvw;

        System.out.println(qaqtjizs); // BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)
    }
}