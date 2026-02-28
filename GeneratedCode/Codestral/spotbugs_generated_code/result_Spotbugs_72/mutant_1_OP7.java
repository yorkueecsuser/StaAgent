class UnrelatedTypesComparison {
    private boolean getCondition() {
        return false; // This method returns a false value to create an unreachable while loop
    }

    public boolean showBug(Object obj, String str) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This while loop is unreachable because the condition is always false
        }

        // Original code
        return obj == str; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    }
}