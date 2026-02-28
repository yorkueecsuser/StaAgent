class IntComparisonBug {
    public boolean showBug(int val) {
        // BUG: INT: Bad comparison of int value with long constant (INT_BAD_COMPARISON_WITH_INT_VALUE)
        int valueRenamed = val;
        return valueRenamed == 2147483648L;
    }

    public static void main(String[] args) {
        IntComparisonBug bug = new IntComparisonBug();
        boolean resultRenamed = bug.showBug(Integer.MAX_VALUE);
        System.out.println("Result: " + resultRenamed);
    }
}