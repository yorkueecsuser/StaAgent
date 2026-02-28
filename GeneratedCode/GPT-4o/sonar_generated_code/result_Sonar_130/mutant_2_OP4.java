class FloatMathBugDemonstration {

    // Method to simulate a dynamic condition check
    private boolean getCondition() {
        return false;
    }

    public float showBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats

        // Adding an unreachable if-else statement
        if (getCondition()) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println("Executing original logic");
        }

        return c;
    }

    public double showBugWithDouble() {
        float a = 16777216.0f;
        float b = 1.0f;
        double d = a + b; // BUG: Math should not be performed on floats

        // Adding an unreachable if-else statement
        if (getCondition()) {
            System.out.println("This code is unreachable");
        } else {
            System.out.println("Executing original logic for double");
        }

        return d;
    }

    public static void main(String[] args) {
        FloatMathBugDemonstration demo = new FloatMathBugDemonstration();
        System.out.println("Result of showBug: " + demo.showBug());
        System.out.println("Result of showBugWithDouble: " + demo.showBugWithDouble());
    }
}