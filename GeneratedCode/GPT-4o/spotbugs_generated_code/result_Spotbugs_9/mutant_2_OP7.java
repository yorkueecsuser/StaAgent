class RepeatedConditionalTestExample {

    public boolean showBug(int x, int y) {
        // This method demonstrates the repeated conditional test bug.
        return x == 0 || x == 0; // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
    }

    public static void main(String[] args) {
        RepeatedConditionalTestExample example = new RepeatedConditionalTestExample();
        boolean result = example.showBug(0, 5);
        System.out.println("Result of showBug: " + result);
        
        // Introduce an unreachable while loop
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            System.out.println("This code is unreachable.");
        }
    }
    
    // This method returns false, making the while loop condition false
    private static boolean getFalseCondition() {
        return false;
    }
}