class IncompatibleArrayCompareBug {
    public boolean showBug(Object[] array1, Object[] a) {
        return array1.equals(a); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    }
}