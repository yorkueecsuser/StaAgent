class IncompatibleArrayCompareBug {
    public boolean showBug(Object[] array1, Object[] array2) {
        Object[] objArr1 = array1; // Mutated: Renaming array1 to objArr1
        Object[] objArr2 = array2; // Mutated: Renaming array2 to objArr2
        return objArr1.equals(objArr2); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    }
}