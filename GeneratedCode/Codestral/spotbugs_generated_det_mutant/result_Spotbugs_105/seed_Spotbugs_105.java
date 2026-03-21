class IncompatibleArrayCompareBug {
    public boolean showBug(Object[] array1, Object[] array2) {
        return array1.equals(array2); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    }
}