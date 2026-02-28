class IntComparisonBug {
    public boolean showBug(int value) {
        // BUG: INT: Bad comparison of int value with long constant (INT_BAD_COMPARISON_WITH_INT_VALUE)
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable if-else statement
            if (false) {
                System.out.println("This statement is unreachable");
            } else {
                System.out.println("This is the else part of unreachable statement");
            }
        }
        return value == 2147483648L;
    }

    private boolean getCondition() {
        // This method can be replaced by a real condition
        return true;
    }

    public static void main(String[] args) {
        IntComparisonBug bug = new IntComparisonBug();
        boolean result = bug.showBug(Integer.MAX_VALUE);
        System.out.println("Result: " + result);
    }
}