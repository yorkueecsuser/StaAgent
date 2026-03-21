class IntComparisonBug {
    public boolean showBug(int value) {
        if (false && false && true && false && true && false && false && false && false && true && false) {long bnrtbqnq = -772898700;}
        // BUG: INT: Bad comparison of int value with long constant (INT_BAD_COMPARISON_WITH_INT_VALUE)
        return value == 2147483648L;
    
}

    public static void main(String[] args) {
        IntComparisonBug bug = new IntComparisonBug();
        boolean result = bug.showBug(Integer.MAX_VALUE);
        System.out.println("Result: " + result);
    }
}