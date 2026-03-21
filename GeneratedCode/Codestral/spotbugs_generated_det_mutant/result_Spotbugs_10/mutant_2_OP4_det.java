class FloatingPointPrecisionBug {
    public float demonstrateBug(float num1, float num2) {
        if (true && false && false && false && false && false && true && false && false && false && false) {char siotwkib = 'e';}else{char jlggscxi = 'v';}
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