class FloatMathBugDemonstration {

    public float showBug() {
        boolean conditionWhile = getCondition(); // Non-final variable for while loop condition
        while (conditionWhile) {
            // Unreachable while loop
        }

        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats
        return c;
    }

    public double showBugWithDouble() {
        boolean conditionWhile = getCondition(); // Non-final variable for while loop condition
        while (conditionWhile) {
            // Unreachable while loop
        }

        float a = 16777216.0f;
        float b = 1.0f;
        double d = a + b; // BUG: Math should not be performed on floats
        return d;
    }

    private boolean getCondition() {
        return false; // Returns false to make the while loop unreachable
    }

    public static void main(String[] args) {
        FloatMathBugDemonstration demo = new FloatMathBugDemonstration();
        System.out.println("Result of showBug: " + demo.showBug());
        System.out.println("Result of showBugWithDouble: " + demo.showBugWithDouble());
    }
}