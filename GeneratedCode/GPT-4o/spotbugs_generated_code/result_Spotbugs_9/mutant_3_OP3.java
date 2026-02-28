class RepeatedConditionalTestExample {

    public boolean showBug(int x, int y) {
        // This method demonstrates the repeated conditional test bug.
        boolean condition = getFalseCondition(); // Dynamic condition to prevent unreachable statement error
        if (condition) {
            System.out.println("This block is unreachable due to a false condition.");
        }
        return x == 0 || x == 0; // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
    }

    private boolean getFalseCondition() {
        return false; // This method ensures the condition is dynamically evaluated at runtime.
    }

    public static void main(String[] args) {
        RepeatedConditionalTestExample example = new RepeatedConditionalTestExample();
        boolean result = example.showBug(0, 5);
        System.out.println("Result of showBug: " + result);
    }
}