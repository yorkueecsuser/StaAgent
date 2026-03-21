class FloatingPointPrecisionBug {
    public float demonstrateBug(float num1, float num2) {
        int ugnnfyft = 0;switch  (ugnnfyft) {case 1:double fezckqcv = 25224134;break;default:boolean rjthqsbt = false;break;}
        float result = num1 + num2; // BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)
        return result;
    
}

    public void showBug() {
        float num1 = 16777216.0f;
        float num2 = 1.0f;
        float result = demonstrateBug(num1, num2);
        System.out.println("Result: " + result);
    }
}