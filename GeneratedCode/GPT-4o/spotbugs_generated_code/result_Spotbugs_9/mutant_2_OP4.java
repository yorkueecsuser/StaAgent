class RepeatedConditionalTestExample {

    public boolean showBug(int x, int y) {
        // This method demonstrates the repeated conditional test bug.
        return x == 0 || x == 0; // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
    }

    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        RepeatedConditionalTestExample example = new RepeatedConditionalTestExample();
        boolean result = example.showBug(0, 5);
        System.out.println("Result of showBug: " + result);

        // Adding unreachable if-else statement
        boolean unreachableCondition = example.getFalseCondition();
        if (unreachableCondition) {
            System.out.println("This code will never be executed.");
        } else {
            // Since the condition is always false, this block will always execute.
            System.out.println("This code will always be executed as the condition is false.");
        }
    }
}