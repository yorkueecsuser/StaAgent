class FloatMathBugDemonstration {

    public float showBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats

        boolean conditionFor = getUnreachableCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable loop code
        }

        return c;
    }

    public double showBugWithDouble() {
        float a = 16777216.0f;
        float b = 1.0f;
        double d = a + b; // BUG: Math should not be performed on floats

        boolean conditionFor = getUnreachableCondition();
        for (int i = 0; conditionFor; i++) {
            // Unreachable loop code
        }

        return d;
    }

    public static void main(String[] args) {
        FloatMathBugDemonstration demo = new FloatMathBugDemonstration();
        System.out.println("Result of showBug: " + demo.showBug());
        System.out.println("Result of showBugWithDouble: " + demo.showBugWithDouble());
    }

    // Method to simulate a dynamic condition that always returns false
    private boolean getUnreachableCondition() {
        return false;
    }
}