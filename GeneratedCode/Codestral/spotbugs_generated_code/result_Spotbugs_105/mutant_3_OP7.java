class IncompatibleArrayCompareBug {
    public boolean showBug(Object[] array1, Object[] array2) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
        }
        return array1.equals(array2); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
    }

    private boolean getCondition() {
        // this function will return false to make the while loop unreachable
        return false;
    }
}