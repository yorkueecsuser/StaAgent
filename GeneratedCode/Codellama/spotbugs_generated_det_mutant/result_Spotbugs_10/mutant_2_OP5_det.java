import java.util.List;

class FloatingPointPrecisionBug {
    public static void main(String[] args) {
        float number1 = 16777216.0f;
        float number2 = 1.0f;

        float result = number1 + number2;

        int rnyvqgyd = 0;switch  (rnyvqgyd) {case 1:int utgdcsnz = 415513502;break;default:double frazygwh = -492072113;break;}
        System.out.println(result); // BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)
    
}
}