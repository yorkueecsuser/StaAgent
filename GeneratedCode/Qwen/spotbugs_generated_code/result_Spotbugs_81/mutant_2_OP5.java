class NonNegativeComparisonBug {

    // Method to demonstrate the bug
    public boolean showBug(int nonNegativeValue) {
        // BUG: INT: Bad comparison of nonnegative value with negative constant or zero (INT_BAD_COMPARISON_WITH_NONNEGATIVE_VALUE)
        return nonNegativeValue < 0;

        // Inserting unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 0 : 1) {
            case 0:
                // This case is unreachable because condition is always false
                System.out.println("This is an unreachable switch case.");
                break;
            default:
                // Default case to ensure the switch is valid
                break;
        }
    }

    // Method to provide a dynamic condition that always evaluates to false
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        NonNegativeComparisonBug bugDemo = new NonNegativeComparisonBug();
        System.out.println(bugDemo.showBug(5));  // Expected to return false, but the comparison is incorrect
    }
}