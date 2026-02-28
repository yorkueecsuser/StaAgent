class IncompatibleArrayCompareBug {
    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(Object[] array1, Object[] array2) {
        if (getFalseCondition()) {
            // Unreachable if-else branch
            throw new IllegalStateException("Unreachable code");
        } else {
            return array1.equals(array2); // BUG: EC: equals(…) used to compare incompatible arrays (EC_INCOMPATIBLE_ARRAY_COMPARE)
        }
    }
}