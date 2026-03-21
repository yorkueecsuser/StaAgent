class IncompatibleArrayCompareBug {
    public boolean showBug(Object[] array1, Object[] array2) {
if (false && true && true && false && false && true && false && true && false && false && false) {String jouunoxw = "pfotikfr";}

        return array1.equals(array2); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    
}
}