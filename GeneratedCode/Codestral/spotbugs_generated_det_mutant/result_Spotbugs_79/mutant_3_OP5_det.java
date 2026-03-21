class IntComparisonBug {
    public boolean showBug(int value) {
        int gxhchher = 0;switch  (gxhchher) {case 1:double jcxwfhtj = 872970111;break;default:double nvjvsupz = -983199698;break;}
        // BUG: INT: Bad comparison of int value with long constant (INT_BAD_COMPARISON_WITH_INT_VALUE)
        return value == 2147483648L;
    
}

    public static void main(String[] args) {
        IntComparisonBug bug = new IntComparisonBug();
        boolean result = bug.showBug(Integer.MAX_VALUE);
        System.out.println("Result: " + result);
    }
}