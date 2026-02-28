class FloatMathBugDemonstration {

    public float showBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats
        
        // Unreachable if-else statement
        boolean alwaysFalseCondition = getFalseCondition();
        if (alwaysFalseCondition) {
            System.out.println("This code is unreachable.");
        } else {
            // This else branch is effectively a no-op but keeps the if statement valid
        }
        
        return c;
    }

    public double showBugWithDouble() {
        float a = 16777216.0f;
        float b = 1.0f;
        double d = a + b; // BUG: Math should not be performed on floats
        
        // Unreachable if-else statement
        boolean alwaysFalseCondition = getFalseCondition();
        if (alwaysFalseCondition) {
            System.out.println("This code is unreachable.");
        } else {
            // This else branch is effectively a no-op but keeps the if statement valid
        }
        
        return d;
    }

    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        FloatMathBugDemonstration demo = new FloatMathBugDemonstration();
        System.out.println("Result of showBug: " + demo.showBug());
        System.out.println("Result of showBugWithDouble: " + demo.showBugWithDouble());
    }
}