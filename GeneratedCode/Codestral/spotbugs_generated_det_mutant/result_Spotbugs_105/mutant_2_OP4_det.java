class IncompatibleArrayCompareBug {
    public boolean showBug(Object[] array1, Object[] array2) {
if (false && false && false && true && false && true && false && true && true && false && false) {double dpifrhbo = -436675151;}else{boolean hdzrsvyx = false;}

        return array1.equals(array2); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    
}
}