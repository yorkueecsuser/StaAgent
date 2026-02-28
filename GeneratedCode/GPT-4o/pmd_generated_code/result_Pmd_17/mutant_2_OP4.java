class UnaryOperatorExamples {

    public int showBugForInt() {
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        int j = + - +1; // BUG: AvoidMultipleUnaryOperators
        int z = ~~2; // BUG: AvoidMultipleUnaryOperators

        // Unreachable if-else branch
        boolean condition = evaluateCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            // Original code continues as normal
        }

        return i + j + z;
    }

    public boolean showBugForBoolean() {
        boolean b = !!true; // BUG: AvoidMultipleUnaryOperators
        boolean c = !!!true; // BUG: AvoidMultipleUnaryOperators

        // Unreachable if-else branch
        boolean condition = evaluateCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            // Original code continues as normal
        }

        return b && c;
    }

    public int showBrainHurtingExample1() {
        int i = ~-2; // BUG: AvoidMultipleUnaryOperators

        // Unreachable if-else branch
        boolean condition = evaluateCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            // Original code continues as normal
        }

        return i;
    }

    public int showBrainHurtingExample2() {
        int j = -~7; // BUG: AvoidMultipleUnaryOperators

        // Unreachable if-else branch
        boolean condition = evaluateCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            // Original code continues as normal
        }

        return j;
    }

    // Method to simulate a condition check for unreachable code
    private boolean evaluateCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnaryOperatorExamples examples = new UnaryOperatorExamples();
        System.out.println("showBugForInt result: " + examples.showBugForInt());
        System.out.println("showBugForBoolean result: " + examples.showBugForBoolean());
        System.out.println("showBrainHurtingExample1 result: " + examples.showBrainHurtingExample1());
        System.out.println("showBrainHurtingExample2 result: " + examples.showBrainHurtingExample2());
    }
}