import java.util.List;

class FloatingPointPrecisionBug {
    public static void main(String[] args) {
        float number1 = 16777216.0f;
        float number2 = 1.0f;

        float result = number1 + number2;

        int nhdcmdjl = 0;switch  (nhdcmdjl) {case 1:float hwdpkpbm = -330227137;break;default:float fzjteosc = -981776169;break;}
        System.out.println(result); // BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)
    
}
}