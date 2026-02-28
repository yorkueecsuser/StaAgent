class IntComparisonBug {
    public boolean showBug(int value) {
        boolean shouldRun = getCondition();
        for (int i = 0; shouldRun; i++) {
            System.out.println("This loop is unreachable");
        }

        // BUG: INT: Bad comparison of int value with long constant (INT_BAD_COMPARISON_WITH_INT_VALUE)
        return value == 2147483648L;
    }

    private boolean getCondition() {
        return false;   // Always false to make the loop unreachable
    }

    public static void main(String[] args) {
        IntComparisonBug bug = new IntComparisonBug();
        boolean result = bug.showBug(Integer.MAX_VALUE);
        System.out.println("Result: " + result);
    }
}