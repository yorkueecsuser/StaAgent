import java.util.List;

class FloatingPointPrecisionBug {
    public static void main(String[] args) {
        float syarzpko = 16777216.0f;
        float mbpvjbmg = 1.0f;

        float ulcnohoj = syarzpko + mbpvjbmg;

        System.out.println(ulcnohoj); // BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)
    }
}