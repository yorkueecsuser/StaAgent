class FloatMathBugDemonstration {

    public float showBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats
        
        // Unreachable switch statement
        int impossibleCondition = getImpossibleCondition();
        switch (impossibleCondition) {
            case 1:
                System.out.println("This is unreachable");
                break;
            default:
                break;
        }
        
        return c;
    }

    public double showBugWithDouble() {
        float a = 16777216.0f;
        float b = 1.0f;
        double d = a + b; // BUG: Math should not be performed on floats
        
        // Unreachable switch statement
        int impossibleCondition = getImpossibleCondition();
        switch (impossibleCondition) {
            case 2:
                System.out.println("This is unreachable too");
                break;
            default:
                break;
        }
        
        return d;
    }
    
    // Helper method to ensure a non-final variable is used
    private int getImpossibleCondition() {
        return -1; // Always returns a value that doesn't match any case in the switch
    }

    public static void main(String[] args) {
        FloatMathBugDemonstration demo = new FloatMathBugDemonstration();
        System.out.println("Result of showBug: " + demo.showBug());
        System.out.println("Result of showBugWithDouble: " + demo.showBugWithDouble());
    }
}