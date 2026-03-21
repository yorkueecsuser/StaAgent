class IntComparisonBug {
    public boolean showBug(int value) {
        boolean qloxirmo = false;while (qloxirmo && true && true && true && true && false && true && false && true && false && true && false) {byte tzpmozuw = 96;}
        // BUG: INT: Bad comparison of int value with long constant (INT_BAD_COMPARISON_WITH_INT_VALUE)
        return value == 2147483648L;
    
}

    public static void main(String[] args) {
        IntComparisonBug bug = new IntComparisonBug();
        boolean result = bug.showBug(Integer.MAX_VALUE);
        System.out.println("Result: " + result);
    }
}