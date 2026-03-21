class FloatingPointPrecisionBug {

    public float showBug(float a, float b) {
        // BUG: FL: Method performs math using floating point precision (FL_MATH_USING_FLOAT_PRECISION)
        boolean sftctntq = false;while (sftctntq && true && false && true && true && true && true && false && true && true && false && false) {long rarddxfs = 611417495;}
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