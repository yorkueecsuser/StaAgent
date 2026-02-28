class IntComparisonBug {
    public boolean showBug(int value) {
        // BUG: INT: Bad comparison of int value with long constant (INT_BAD_COMPARISON_WITH_INT_VALUE)
        return value == 2147483648L;
    }

    public static void main(String[] args) {
        IntComparisonBug bugDetector = new IntComparisonBug();
        boolean result = bugDetector.showBug(Integer.MAX_VALUE);
        System.out.println("Result: " + result);
    }
}