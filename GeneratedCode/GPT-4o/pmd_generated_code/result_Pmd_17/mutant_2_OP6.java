class UnaryOperatorExamples {

    public int showBugForInt() {
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        int j = + - +1; // BUG: AvoidMultipleUnaryOperators
        int z = ~~2; // BUG: AvoidMultipleUnaryOperators

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int k = 0; conditionFor; k++) {
            // Unreachable code
            System.out.println("This for loop is unreachable.");
        }

        return i + j + z;
    }

    public boolean showBugForBoolean() {
        boolean b = !!true; // BUG: AvoidMultipleUnaryOperators
        boolean c = !!!true; // BUG: AvoidMultipleUnaryOperators

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int k = 0; conditionFor; k++) {
            // Unreachable code
            System.out.println("This for loop is unreachable.");
        }

        return b && c;
    }

    public int showBrainHurtingExample1() {
        int i = ~-2; // BUG: AvoidMultipleUnaryOperators

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int k = 0; conditionFor; k++) {
            // Unreachable code
            System.out.println("This for loop is unreachable.");
        }

        return i;
    }

    public int showBrainHurtingExample2() {
        int j = -~7; // BUG: AvoidMultipleUnaryOperators

        // Inserting unreachable for loop
        boolean conditionFor = getCondition();
        for (int k = 0; conditionFor; k++) {
            // Unreachable code
            System.out.println("This for loop is unreachable.");
        }

        return j;
    }
    
    private boolean getCondition() {
        // This method will return false to simulate an unreachable loop
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