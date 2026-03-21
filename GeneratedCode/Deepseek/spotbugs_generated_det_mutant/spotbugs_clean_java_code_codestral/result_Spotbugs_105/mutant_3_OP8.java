class IncompatibleArrayCompareBug {
    public boolean showBug(Object[] array1, Object[] array2) {
        Object[] a = array1;
        Object[] b = array2;
        return a.equals(b); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    }
}