class IncompatibleArrayCompareBug {
    public boolean showBug(Object[] array1, Object[] array2) {
        boolean conditionWhile = false;
        while (conditionWhile) {
            // This loop is unreachable as conditionWhile is always false
        }
        return array1.equals(array2); // Original bug is still present
    }

    private boolean getCondition() {
        return false; // Returns false to maintain the unreachable while loop
    }
}