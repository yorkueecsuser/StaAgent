class IntComparisonBug {
    public boolean showBug(int value) {
        // BUG: INT: Bad comparison of int value with long constant (INT_BAD_COMPARISON_WITH_INT_VALUE)
        boolean conditionWhile = isFalse();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This is an unreachable statement");
        }
        return value == 2147483648L;
    }

    private boolean isFalse() {
        return false;
    }

    public static void main(String[] args) {
        IntComparisonBug bug = new IntComparisonBug();
        boolean result = bug.showBug(Integer.MAX_VALUE);
        System.out.println("Result: " + result);
    }
}