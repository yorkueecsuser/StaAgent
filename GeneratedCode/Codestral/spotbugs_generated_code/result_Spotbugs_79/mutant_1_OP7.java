class IntComparisonBug {
    public boolean showBug(int value) {
        // BUG: INT: Bad comparison of int value with long constant (INT_BAD_COMPARISON_WITH_INT_VALUE)
        return value == 2147483648L;

        // MUTANT: Adding an unreachable while loop
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            System.out.println("This line is unreachable");
        }
    }

    public static void main(String[] args) {
        IntComparisonBug bug = new IntComparisonBug();
        boolean result = bug.showBug(Integer.MAX_VALUE);
        System.out.println("Result: " + result);
    }
}