class RepeatedConditionalTestExample {

    public boolean showBug(int x, int y) {
        // This method demonstrates the repeated conditional test bug.
        return x == 0 || x == 0; // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        RepeatedConditionalTestExample example = new RepeatedConditionalTestExample();
        boolean result = example.showBug(0, 5);
        System.out.println("Result of showBug: " + result);

        // Adding an unreachable if-else branch using a non-final variable.
        RepeatedConditionalTestExample example2 = new RepeatedConditionalTestExample();
        boolean unreachableCondition = example2.getCondition();
        if (unreachableCondition) {
            // This block is unreachable
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This code is always executed.");
        }
    }
}