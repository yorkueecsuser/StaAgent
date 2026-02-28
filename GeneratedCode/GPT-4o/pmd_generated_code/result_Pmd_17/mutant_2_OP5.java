class UnaryOperatorExamples {

    // Method to simulate a dynamic condition
    private boolean getDynamicCondition() {
        return false;
    }

    public int showBugForInt() {
        int i = - -1; // BUG: AvoidMultipleUnaryOperators
        int j = + - +1; // BUG: AvoidMultipleUnaryOperators
        int z = ~~2; // BUG: AvoidMultipleUnaryOperators

        // Adding an unreachable switch statement
        int unreachableSwitch = 10; // Non-final variable
        switch (unreachableSwitch) {
            case 0:
                System.out.println("This case is unreachable");
                break;
            default:
                break;
        }

        return i + j + z;
    }

    public boolean showBugForBoolean() {
        boolean b = !!true; // BUG: AvoidMultipleUnaryOperators
        boolean c = !!!true; // BUG: AvoidMultipleUnaryOperators

        // Adding an unreachable switch statement
        int unreachableSwitch = 20; // Non-final variable
        switch (unreachableSwitch) {
            case 0:
                System.out.println("This case is unreachable");
                break;
            default:
                break;
        }

        return b && c;
    }

    public int showBrainHurtingExample1() {
        int i = ~-2; // BUG: AvoidMultipleUnaryOperators

        // Adding an unreachable switch statement
        int unreachableSwitch = 30; // Non-final variable
        switch (unreachableSwitch) {
            case 0:
                System.out.println("This case is unreachable");
                break;
            default:
                break;
        }

        return i;
    }

    public int showBrainHurtingExample2() {
        int j = -~7; // BUG: AvoidMultipleUnaryOperators

        // Adding an unreachable switch statement
        int unreachableSwitch = 40; // Non-final variable
        switch (unreachableSwitch) {
            case 0:
                System.out.println("This case is unreachable");
                break;
            default:
                break;
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
}