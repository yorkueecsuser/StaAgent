class FloatMathBugDemonstration {

    public float showBug() {
        // Introduce an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code block will never execute
        }
        
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats
        return c;
    }

    public double showBugWithDouble() {
        // Introduce an unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code block will never execute
        }
        
        float a = 16777216.0f;
        float b = 1.0f;
        double d = a + b; // BUG: Math should not be performed on floats
        return d;
    }

    private boolean getCondition() {
        // Always returns false, making the while loop unreachable
        return false;
    }

    public static void main(String[] args) {
        FloatMathBugDemonstration demo = new FloatMathBugDemonstration();
        System.out.println("Result of showBug: " + demo.showBug());
        System.out.println("Result of showBugWithDouble: " + demo.showBugWithDouble());
    }
}