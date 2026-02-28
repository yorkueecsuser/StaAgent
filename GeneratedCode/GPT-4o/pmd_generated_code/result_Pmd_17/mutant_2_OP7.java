class UnaryOperatorExamples {

    public int showBugForInt() {
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        int j = + - +1; // BUG: AvoidMultipleUnaryOperators
        int z = ~~2; // BUG: AvoidMultipleUnaryOperators

        // Insert unreachable while loop
        boolean conditionWhile = getCondition(); // A method to ensure dynamic condition
        while (conditionWhile) {
            System.out.println("This will never be printed");
        }

        return i + j + z;
    }

    public boolean showBugForBoolean() {
        boolean b = !!true; // BUG: AvoidMultipleUnaryOperators
        boolean c = !!!true; // BUG: AvoidMultipleUnaryOperators
        
        // Insert unreachable while loop
        boolean conditionWhile = getCondition(); // A method to ensure dynamic condition
        while (conditionWhile) {
            System.out.println("This will never be printed");
        }

        return b && c;
    }

    public int showBrainHurtingExample1() {
        int i = ~-2; // BUG: AvoidMultipleUnaryOperators
        
        // Insert unreachable while loop
        boolean conditionWhile = getCondition(); // A method to ensure dynamic condition
        while (conditionWhile) {
            System.out.println("This will never be printed");
        }

        return i;
    }

    public int showBrainHurtingExample2() {
        int j = -~7; // BUG: AvoidMultipleUnaryOperators

        // Insert unreachable while loop
        boolean conditionWhile = getCondition(); // A method to ensure dynamic condition
        while (conditionWhile) {
            System.out.println("This will never be printed");
        }

        return j;
    }

    // Method to simulate a dynamic condition for the while loop
    private boolean getCondition() {
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