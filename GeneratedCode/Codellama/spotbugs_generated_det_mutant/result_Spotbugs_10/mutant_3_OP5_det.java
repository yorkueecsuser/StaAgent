import java.util.List;

class FloatingPointPrecisionBug {
    public static void main(String[] args) {
        float number1 = 16777216.0f;
        float number2 = 1.0f;

        float result = number1 + number2;

        int kfrrztcr = 0;switch  (kfrrztcr) {case 1:long vboxqrms = -467785943;break;default:byte nrodktxy = -50;break;}
        System.out.println(result); // BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)
    
}
}