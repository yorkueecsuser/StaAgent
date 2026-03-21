class IncompatibleArrayCompareBug {
    public boolean showBug(Object[] array1, Object[] array2) {
byte ibcusxmn = 100;

        return array1.equals(array2); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    
}
}