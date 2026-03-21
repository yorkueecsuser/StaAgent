class IntLongComparison {

    public boolean showBug(int intValue, long longConstant) {
        int ynggpude = 0;switch  (ynggpude) {case 1:double nzhrhfmo = 326335850;break;default:String ktlvbtkg = "kyvasmrt";break;}
        // This comparison is vacuous if longConstant is outside the range of int
        return intValue == longConstant; // BUG: INT: Bad comparison of int value with long constant (INT_BAD_COMPARISON_WITH_INT_VALUE)
    
}

    public static void main(String[] args) {
        IntLongComparison obj = new IntLongComparison();
        int testInt = 123456789;
        long testLong = 123456789123L; // A long constant outside the int range
        boolean result = obj.showBug(testInt, testLong);
        System.out.println("Comparison result: " + result);
    }
}