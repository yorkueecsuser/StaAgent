import java.util.List;

class FloatingPointPrecisionBug {
    public static void main(String[] args) {
        float number1 = 16777216.0f;
        float number2 = 1.0f;

        float result = number1 + number2;

        boolean fhisugfh = false;while (fhisugfh && false && false && false && false && true && true && true && false && false && false && false) {byte rnqfvylg = -13;}
        System.out.println(result); // BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)
    
}
}