class FloatingPointPrecisionBug {
    public float demonstrateBug(float num1, float num2) {
        if (true && true && false && false && false && true && false && false && true && false && false) {boolean wrgwadau = true;}else{int lrywhttm = -553811364;}
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