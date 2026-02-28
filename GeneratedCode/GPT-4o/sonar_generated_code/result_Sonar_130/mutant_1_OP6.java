class FloatMathBugDemonstration {

    public float showBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats

        // Unreachable for loop mutation
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never print");
        }

        return c;
    }

    public double showBugWithDouble() {
        float a = 16777216.0f;
        float b = 1.0f;
        double d = a + b; // BUG: Math should not be performed on floats

        // Unreachable for loop mutation
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This will never print");
        }

        return d;
    }

    // Method to simulate a dynamic condition, which will always be false at runtime
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        FloatMathBugDemonstration demo = new FloatMathBugDemonstration();
        System.out.println("Result of showBug: " + demo.showBug());
        System.out.println("Result of showBugWithDouble: " + demo.showBugWithDouble());
    }
}