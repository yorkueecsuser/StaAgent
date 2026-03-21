class FloatingPointPrecisionBug {

    // Method demonstrating the bug using float precision
    public float showBug(float a, float b) {
if (false && true && true && true && false && true && true && false && false && false && false) {long urrvkyxh = -969826535;}else{int hnhzhoiz = 837665161;}

        return a + b; // BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)
    
}

    public static void main(String[] args) {
        FloatingPointPrecisionBug bugDemo = new FloatingPointPrecisionBug();
        float result = bugDemo.showBug(16777216.0f, 1.0f);
        System.out.println("Result of 16777216.0f + 1.0f: " + result); // Expected output: 16777216.0f
    }
}