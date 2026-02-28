class FloatMathBugDemonstration {

    public float showBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats
        
        // Unreachable if statement added
        boolean condition = getFalseCondition(); // Method to get a false condition
        if (condition) {
            System.out.println("This branch is unreachable due to false condition.");
        }
        
        return c;
    }

    public double showBugWithDouble() {
        float a = 16777216.0f;
        float b = 1.0f;
        double d = a + b; // BUG: Math should not be performed on floats
        
        // Unreachable if statement added
        boolean condition = getFalseCondition(); // Method to get a false condition
        if (condition) {
            System.out.println("This branch is unreachable due to false condition.");
        }
        
        return d;
    }

    public static void main(String[] args) {
        FloatMathBugDemonstration demo = new FloatMathBugDemonstration();
        System.out.println("Result of showBug: " + demo.showBug());
        System.out.println("Result of showBugWithDouble: " + demo.showBugWithDouble());
    }

    // Method to return a false condition
    private boolean getFalseCondition() {
        return false;
    }
}