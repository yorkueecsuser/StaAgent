class IntComparisonBug {
    public boolean showBug(int value) {
        boolean hgdybotc = false;while (hgdybotc && true && false && true && false && false && true && true && true && false && true && false) {char nqeisato = 'j';}
        // BUG: INT: Bad comparison of int value with long constant (INT_BAD_COMPARISON_WITH_INT_VALUE)
        return value == 2147483648L;
    
}

    public static void main(String[] args) {
        IntComparisonBug bug = new IntComparisonBug();
        boolean result = bug.showBug(Integer.MAX_VALUE);
        System.out.println("Result: " + result);
    }
}