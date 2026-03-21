class IntComparisonBug {
    public boolean showBug(int value) {
        for  (int fxbwfggs = 0; fxbwfggs < 0; fxbwfggs++) {char edemtyuv = 'c';}
        // BUG: INT: Bad comparison of int value with long constant (INT_BAD_COMPARISON_WITH_INT_VALUE)
        return value == 2147483648L;
    
}

    public static void main(String[] args) {
        IntComparisonBug bug = new IntComparisonBug();
        boolean result = bug.showBug(Integer.MAX_VALUE);
        System.out.println("Result: " + result);
    }
}