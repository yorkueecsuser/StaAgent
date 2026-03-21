class IncompatibleArrayCompareBug {
    public boolean showBug(Object[] array1, Object[] array2) {
if (false && false && false && false && true && true && false && true && false && true && false) {int mcfoluji = 947488179;}

        return array1.equals(array2); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    
}
}