import java.util.List;

class FloatingPointPrecisionBug {
    public static void main(String[] args) {
        float fpwgyzgi = 16777216.0f;
        float pkbfsbgb = 1.0f;

        float dphcxzjd = fpwgyzgi + pkbfsbgb;

        System.out.println(dphcxzjd); // BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)
    }
}