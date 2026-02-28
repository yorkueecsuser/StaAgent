class UnaryOperatorExamples {

    public int showBugForInt() {
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        int j = + - +1; // BUG: AvoidMultipleUnaryOperators
        int z = ~~2; // BUG: AvoidMultipleUnaryOperators

        // Insert unreachable for loop
        boolean conditionFor = getFalseCondition(); // Ensures the loop condition is false
        for (int k = 0; conditionFor; k++) {
            // This code block is unreachable
            System.out.println("Unreachable for loop executed.");
        }

        return i + j + z;
    }

    public boolean showBugForBoolean() {
        boolean b = !!true; // BUG: AvoidMultipleUnaryOperators
        boolean c = !!!true; // BUG: AvoidMultipleUnaryOperators

        // Insert unreachable for loop
        boolean conditionFor = getFalseCondition(); // Ensures the loop condition is false
        for (int k = 0; conditionFor; k++) {
            // This code block is unreachable
            System.out.println("Unreachable for loop executed.");
        }

        return b && c;
    }

    public int showBrainHurtingExample1() {
        int i = ~-2; // BUG: AvoidMultipleUnaryOperators

        // Insert unreachable for loop
        boolean conditionFor = getFalseCondition(); // Ensures the loop condition is false
        for (int k = 0; conditionFor; k++) {
            // This code block is unreachable
            System.out.println("Unreachable for loop executed.");
        }

        return i;
    }

    public int showBrainHurtingExample2() {
        int j = -~7; // BUG: AvoidMultipleUnaryOperators

        // Insert unreachable for loop
        boolean conditionFor = getFalseCondition(); // Ensures the loop condition is false
        for (int k = 0; conditionFor; k++) {
            // This code block is unreachable
            System.out.println("Unreachable for loop executed.");
        }

        return j;
    }

    public static void main(String[] args) {
        UnaryOperatorExamples examples = new UnaryOperatorExamples();
        System.out.println("showBugForInt result: " + examples.showBugForInt());
        System.out.println("showBugForBoolean result: " + examples.showBugForBoolean());
        System.out.println("showBrainHurtingExample1 result: " + examples.showBrainHurtingExample1());
        System.out.println("showBrainHurtingExample2 result: " + examples.showBrainHurtingExample2());
    }

    // Method to return false, simulating a non-final variable
    private boolean getFalseCondition() {
        return false;
    }
}