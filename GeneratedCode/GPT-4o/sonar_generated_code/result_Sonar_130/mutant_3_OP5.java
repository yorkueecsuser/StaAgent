class FloatMathBugDemonstration {

    public float showBug() {
        float a = 16777216.0f;
        float b = 1.0f;
        float c = a + b; // BUG: Math should not be performed on floats
        
        // Unreachable switch statement
        int unreachableSwitchVariable = getUnreachableValue();
        switch (unreachableSwitchVariable) {
            case 9999:
                System.out.println("This code is unreachable.");
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
        int unreachableSwitchVariable = getUnreachableValue();
        switch (unreachableSwitchVariable) {
            case 9999:
                System.out.println("This code is unreachable.");
                break;
            default:
                break;
        }
        
        return d;
    }

    private int getUnreachableValue() {
        return 0; // This ensures the switch statement is unreachable
    }

    public static void main(String[] args) {
        FloatMathBugDemonstration demo = new FloatMathBugDemonstration();
        System.out.println("Result of showBug: " + demo.showBug());
        System.out.println("Result of showBugWithDouble: " + demo.showBugWithDouble());
    }
}