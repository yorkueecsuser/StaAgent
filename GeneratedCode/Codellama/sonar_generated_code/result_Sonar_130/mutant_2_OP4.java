class FloatMathBug {
    public static void main(String[] args) {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats
        System.out.println(c);
        
        // Inserted unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            // do nothing
        } else {
            // do something
        }
    }
    
    private static boolean getCondition() {
        // Generate a random boolean value
        return Math.random() > 0.5;
    }
}