class FloatingPointPrecisionBug {
    public float demonstrateBug(float num1, float num2) {
        float result = num1 + num2; // BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)
        return result;
    }

    public void showBug() {
        float num1 = 16777216.0f;
        float num2 = 1.0f;
        float r = demonstrateBug(num1, num2); // Variable'result' renamed to 'r'
        System.out.println("Result: " + r); // Updated to use the new variable name
    }
}