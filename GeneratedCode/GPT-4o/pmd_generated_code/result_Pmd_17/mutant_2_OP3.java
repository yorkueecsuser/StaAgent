class UnaryOperatorExamples {

    public int showBugForInt() {
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        int j = + - +1; // BUG: AvoidMultipleUnaryOperators
        int z = ~~2; // BUG: AvoidMultipleUnaryOperators
        
        // Mutation: Inserting an unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable branch in showBugForInt.");
        }
        
        return i + j + z;
    }

    public boolean showBugForBoolean() {
        boolean b = !!true; // BUG: AvoidMultipleUnaryOperators
        boolean c = !!!true; // BUG: AvoidMultipleUnaryOperators
        
        // Mutation: Inserting an unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable branch in showBugForBoolean.");
        }
        
        return b && c;
    }

    public int showBrainHurtingExample1() {
        int i = ~-2; // BUG: AvoidMultipleUnaryOperators
        
        // Mutation: Inserting an unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable branch in showBrainHurtingExample1.");
        }
        
        return i;
    }

    public int showBrainHurtingExample2() {
        int j = -~7; // BUG: AvoidMultipleUnaryOperators
        
        // Mutation: Inserting an unreachable if branch
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This is an unreachable branch in showBrainHurtingExample2.");
        }
        
        return j;
    }

    // Method to simulate dynamic condition for unreachable code
    private boolean getCondition() {
        return false; // This ensures the branch is unreachable but not a compile-time constant
    }

    public static void main(String[] args) {
        UnaryOperatorExamples examples = new UnaryOperatorExamples();
        System.out.println("showBugForInt result: " + examples.showBugForInt());
        System.out.println("showBugForBoolean result: " + examples.showBugForBoolean());
        System.out.println("showBrainHurtingExample1 result: " + examples.showBrainHurtingExample1());
        System.out.println("showBrainHurtingExample2 result: " + examples.showBrainHurtingExample2());
    }
}