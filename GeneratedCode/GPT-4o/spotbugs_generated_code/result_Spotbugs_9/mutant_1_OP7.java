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
        
        boolean conditionWhile = example.getFalseCondition();
        while (conditionWhile) {
            System.out.println("This block is unreachable.");
        }
        
        boolean result = example.showBug(0, 5);
        System.out.println("Result of showBug: " + result);
    }
}