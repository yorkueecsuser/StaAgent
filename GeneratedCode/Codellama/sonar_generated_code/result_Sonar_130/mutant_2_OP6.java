class FloatMathBug {
    public static void main(String[] args) {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats
        System.out.println(c);
        
        boolean condition = getCondition(); // getCondition() returns a boolean value
        if (condition) {
            for (int i = 0; i < 10; i++) {
                // unreachable code
            }
        }
    }
}