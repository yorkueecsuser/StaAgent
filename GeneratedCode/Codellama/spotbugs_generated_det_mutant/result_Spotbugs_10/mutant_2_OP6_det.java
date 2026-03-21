import java.util.List;

class FloatingPointPrecisionBug {
    public static void main(String[] args) {
        float number1 = 16777216.0f;
        float number2 = 1.0f;

        float result = number1 + number2;

        for  (int ujoxgqyi = 0; ujoxgqyi < 0; ujoxgqyi++) {float vilxrvjy = -162884471;}
        System.out.println(result); // BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)
    
}
}