class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
        return obj == str; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
        // MUTATION: Equivalent Loop Replacement would have been applied but no loops are present in the code.
    }
}