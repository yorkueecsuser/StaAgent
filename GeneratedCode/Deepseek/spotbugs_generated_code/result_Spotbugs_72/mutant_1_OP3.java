class UnrelatedTypesComparison {
    private boolean getFalseCondition() {
        return false;
    }

    public boolean showBug(Object obj, String str) {
        if (getFalseCondition()) {
            // Unreachable code
            int x = 10 / 0; // This will cause a division by zero error if the code is ever executed
        }
        return obj == str; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    }
}