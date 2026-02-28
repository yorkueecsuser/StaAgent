class RepeatedConditionalTestExample {

    public boolean showBug(int x, int y) {
        // This method demonstrates the repeated conditional test bug.
        return x == 0 || x == 0; // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
    }

    private boolean getCondition() {
        // This method always returns false making the if-statement branch unreachable.
        return false;
    }

    public void demonstrateUnreachableCode() {
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This is the reachable else block.");
        }
    }

    public static void main(String[] args) {
        RepeatedConditionalTestExample example = new RepeatedConditionalTestExample();
        boolean result = example.showBug(0, 5);
        System.out.println("Result of showBug: " + result);
        
        example.demonstrateUnreachableCode();
    }
}