class RepeatedConditionalTestExample {

    public boolean showBug(int x, int y) {
        // This method demonstrates the repeated conditional test bug.
        boolean conditionFor = getCondition(); // Use a non-final method call for condition
        for (int i = 0; conditionFor; i++) {
            // Unreachable for loop, to satisfy the mutation requirement
            System.out.println("Unreachable code");
        }
        return x == 0 || x == 0; // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
    }

    // Method to simulate a runtime condition that is always false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        RepeatedConditionalTestExample example = new RepeatedConditionalTestExample();
        boolean result = example.showBug(0, 5);
        System.out.println("Result of showBug: " + result);
    }
}