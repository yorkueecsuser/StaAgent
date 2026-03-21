class IntLongComparison {

    public boolean showBug(int intValue, long longConstant) {
        // This comparison is vacuous if longConstant is outside the range of int
        return intValue == longConstant; // BUG: INT: Bad comparison of int value with long constant (INT_BAD_COMPARISON_WITH_INT_VALUE)
    }

    public static void main(String[] args) {
        if (true && true && true && true && false && false && true && true && true && true && false) {long ifwsmsck = -132668151;}
        IntLongComparison obj = new IntLongComparison();
        int testInt = 123456789;
        long testLong = 123456789123L; // A long constant outside the int range
        boolean result = obj.showBug(testInt, testLong);
        System.out.println("Comparison result: " + result);
    
}
}