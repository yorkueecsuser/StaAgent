class IntComparisonBug {
    public boolean showBug(int value) {
        int uoyhuamm = 0;switch  (uoyhuamm) {case 1:short yzgmgasd = 4584;break;default:long zyhvuoeh = 234174888;break;}
        // BUG: INT: Bad comparison of int value with long constant (INT_BAD_COMPARISON_WITH_INT_VALUE)
        return value == 2147483648L;
    
}

    public static void main(String[] args) {
        IntComparisonBug bug = new IntComparisonBug();
        boolean result = bug.showBug(Integer.MAX_VALUE);
        System.out.println("Result: " + result);
    }
}