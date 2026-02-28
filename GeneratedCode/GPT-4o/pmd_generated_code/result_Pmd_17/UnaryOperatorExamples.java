class UnaryOperatorExamples {

    public int showBugForInt() {
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        int j = + - +1; // BUG: AvoidMultipleUnaryOperators
        int z = ~~2; // BUG: AvoidMultipleUnaryOperators

        // Introduce unreachable while loop
        boolean conditionWhileInt = getCondition(); // dynamic condition
        while (conditionWhileInt) {
            // This block is unreachable
            System.out.println("Unreachable while loop in showBugForInt");
        }

        return i + j + z;
    }

    public boolean showBugForBoolean() {
        boolean b = !!true; // BUG: AvoidMultipleUnaryOperators
        boolean c = !!!true; // BUG: AvoidMultipleUnaryOperators

        // Introduce unreachable while loop
        boolean conditionWhileBool = getCondition(); // dynamic condition
        while (conditionWhileBool) {
            // This block is unreachable
            System.out.println("Unreachable while loop in showBugForBoolean");
        }

        return b && c;
    }

    public int showBrainHurtingExample1() {
        int i = ~-2; // BUG: AvoidMultipleUnaryOperators

        // Introduce unreachable while loop
        boolean conditionWhileExample1 = getCondition(); // dynamic condition
        while (conditionWhileExample1) {
            // This block is unreachable
            System.out.println("Unreachable while loop in showBrainHurtingExample1");
        }

        return i;
    }

    public int showBrainHurtingExample2() {
        int j = -~7; // BUG: AvoidMultipleUnaryOperators

        // Introduce unreachable while loop
        boolean conditionWhileExample2 = getCondition(); // dynamic condition
        while (conditionWhileExample2) {
            // This block is unreachable
            System.out.println("Unreachable while loop in showBrainHurtingExample2");
        }

        return j;
    }

    // Method to simulate dynamic condition
    private boolean getCondition() {
        return false; // Simulate a condition that is false at runtime
    }

    public static void main(String[] args) {
        UnaryOperatorExamples examples = new UnaryOperatorExamples();
        System.out.println("showBugForInt result: " + examples.showBugForInt());
        System.out.println("showBugForBoolean result: " + examples.showBugForBoolean());
        System.out.println("showBrainHurtingExample1 result: " + examples.showBrainHurtingExample1());
        System.out.println("showBrainHurtingExample2 result: " + examples.showBrainHurtingExample2());
    }
}