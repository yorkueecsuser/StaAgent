class RepeatedConditionalTestExample {

    public boolean showBug(int x, int y) {
        // This method demonstrates the repeated conditional test bug.
        return x == 0 || x == 0; // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
    }

    private boolean getCondition() {
        // Method to provide a condition that always returns false for the unreachable loop
        return false;
    }

    public static void main(String[] args) {
        RepeatedConditionalTestExample example = new RepeatedConditionalTestExample();
        boolean result = example.showBug(0, 5);
        System.out.println("Result of showBug: " + result);

        // Unreachable for loop mutation operator
        boolean conditionFor = example.getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This line will never be executed.");
        }
    }
}