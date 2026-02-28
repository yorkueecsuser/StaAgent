class IntComparisonBug {
    public boolean showBug(int value) {
        boolean unreachableCondition = getUnreachableCondition();
        for (int i = 0; unreachableCondition; i++) {
            // This loop is unreachable because the condition is always false
            System.out.println("This line should never execute");
        }

        // BUG: INT: Bad comparison of int value with long constant (INT_BAD_COMPARISON_WITH_INT_VALUE)
        return value == 2147483648L;
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the for loop unreachable
        return false;
    }

    public static void main(String[] args) {
        IntComparisonBug bug = new IntComparisonBug();
        boolean result = bug.showBug(Integer.MAX_VALUE);
        System.out.println("Result: " + result);
    }
}