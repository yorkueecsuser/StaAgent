class UnaryOperatorExamples {

    public int showBugForInt() {
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        int j = + - +1; // BUG: AvoidMultipleUnaryOperators
        int z = ~~2; // BUG: AvoidMultipleUnaryOperators
        
        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1: 
                System.out.println("This will never be printed.");
                break;
            default:
                break;
        }
        
        return i + j + z;
    }

    public boolean showBugForBoolean() {
        boolean b = !!true; // BUG: AvoidMultipleUnaryOperators
        boolean c = !!!true; // BUG: AvoidMultipleUnaryOperators
        
        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 2: 
                System.out.println("This will never be printed.");
                break;
            default:
                break;
        }
        
        return b && c;
    }

    public int showBrainHurtingExample1() {
        int i = ~-2; // BUG: AvoidMultipleUnaryOperators
        
        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 3: 
                System.out.println("This will never be printed.");
                break;
            default:
                break;
        }
        
        return i;
    }

    public int showBrainHurtingExample2() {
        int j = -~7; // BUG: AvoidMultipleUnaryOperators
        
        // Unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 4: 
                System.out.println("This will never be printed.");
                break;
            default:
                break;
        }
        
        return j;
    }
    
    // Method to ensure the switch condition is never met
    private int getUnreachableValue() {
        return 0; // This ensures the switch cases are never executed
    }

    public static void main(String[] args) {
        UnaryOperatorExamples examples = new UnaryOperatorExamples();
        System.out.println("showBugForInt result: " + examples.showBugForInt());
        System.out.println("showBugForBoolean result: " + examples.showBugForBoolean());
        System.out.println("showBrainHurtingExample1 result: " + examples.showBrainHurtingExample1());
        System.out.println("showBrainHurtingExample2 result: " + examples.showBrainHurtingExample2());
    }
}