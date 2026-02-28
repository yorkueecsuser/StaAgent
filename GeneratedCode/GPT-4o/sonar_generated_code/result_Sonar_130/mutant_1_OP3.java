class FloatMathBugDemonstration {

    public float showBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        boolean condition = getCondition(); // Unreachable if statement setup
        if (condition) {
            // This block is unreachable but does not cause a compile error
            System.out.println("This is unreachable code.");
        }
        float c = a + b; // BUG: Math should not be performed on floats
        return c;
    }

    public double showBugWithDouble() {
        float a = 16777216.0f;
        float b = 1.0f;
        boolean condition = getCondition(); // Unreachable if statement setup
        if (condition) {
            // This block is unreachable but does not cause a compile error
            System.out.println("This is unreachable code.");
        }
        double d = a + b; // BUG: Math should not be performed on floats
        return d;
    }

    private boolean getCondition() {
        return false; // Always returns false making the condition always false
    }

    public static void main(String[] args) {
        FloatMathBugDemonstration demo = new FloatMathBugDemonstration();
        System.out.println("Result of showBug: " + demo.showBug());
        System.out.println("Result of showBugWithDouble: " + demo.showBugWithDouble());
    }
}