class IncompatibleArrayCompareBug {
    public boolean showBug(Object[] array1, Object[] array2) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            int[] dummyArray = new int[1];
            return dummyArray.equals(array2); // Adding a dummy unreachable branch
        }
        return array1.equals(array2); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    }
}