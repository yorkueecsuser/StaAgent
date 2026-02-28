class FloatMathBugDemonstration {

    public float showBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats

        // Unreachable if-else branch
        boolean condition = getCondition(); // Always returns false
        if (condition) {
            System.out.println("This part is unreachable.");
        } else {
            System.out.println("This part is always executed.");
        }

        return c;
    }

    public double showBugWithDouble() {
        float a = 16777216.0f;
        float b = 1.0f;
        double d = a + b; // BUG: Math should not be performed on floats

        // Unreachable if-else branch
        boolean condition = getCondition(); // Always returns false
        if (condition) {
            System.out.println("This part is unreachable in showBugWithDouble.");
        } else {
            System.out.println("This part is always executed in showBugWithDouble.");
        }

        return d;
    }

    // Method that always returns false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        FloatMathBugDemonstration demo = new FloatMathBugDemonstration();
        System.out.println("Result of showBug: " + demo.showBug());
        System.out.println("Result of showBugWithDouble: " + demo.showBugWithDouble());
    }
}