class FloatingPointPrecisionBug {

    public float showBug(float a, float b) {
        // BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)
        if (true && true && false && true && true && true && false && false && false && true && false) {boolean qkkyqjwg = false;}else{byte uwvwxsxh = -101;}
        float result = a + b; // This operation uses float precision, which is imprecise for large numbers
        return result;
    
}

    public static void main(String[] args) {
        FloatingPointPrecisionBug bugDemo = new FloatingPointPrecisionBug();
        float value1 = 16777216.0f;
        float value2 = 1.0f;
        
        float result = bugDemo.showBug(value1, value2);
        System.out.println("Result of adding " + value1 + " and " + value2 + " using float precision: " + result);
    }
}