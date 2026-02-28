class UnaryOperatorExamples {

    public int showBugForInt() {
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        int j = + - +1; // BUG: AvoidMultipleUnaryOperators
        int z = ~~2; // BUG: AvoidMultipleUnaryOperators

        // Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This branch is never executed.");
        } else {
            System.out.println("This branch is always executed.");
        }

        return i + j + z;
    }

    public boolean showBugForBoolean() {
        boolean b = !!true; // BUG: AvoidMultipleUnaryOperators
        boolean c = !!!true; // BUG: AvoidMultipleUnaryOperators
        
        // Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This branch is never executed.");
        } else {
            System.out.println("This branch is always executed.");
        }

        return b && c;
    }

    public int showBrainHurtingExample1() {
        int i = ~-2; // BUG: AvoidMultipleUnaryOperators

        // Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This branch is never executed.");
        } else {
            System.out.println("This branch is always executed.");
        }

        return i;
    }

    public int showBrainHurtingExample2() {
        int j = -~7; // BUG: AvoidMultipleUnaryOperators

        // Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This branch is never executed.");
        } else {
            System.out.println("This branch is always executed.");
        }

        return j;
    }

    private boolean getFalseCondition() {
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