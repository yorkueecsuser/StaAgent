class IntLongComparison {

    public boolean showBug(int intValue, long longConstant) {
        // This comparison is vacuous if longConstant is outside the range of int
        return intValue == longConstant; // BUG: INT: Bad comparison of int value with long constant (INT_BAD_COMPARISON_WITH_INT_VALUE)
    }

    public static void main(String[] args) {
        IntLongComparison obj = new IntLongComparison();
        int spqddzzc = 123456789;
        long ffltimgj = 123456789123L; // A long constant outside the int range
        boolean pnwqvktr = obj.showBug(spqddzzc, ffltimgj);
        System.out.println("Comparison pnwqvktr: " + pnwqvktr);
    }
}