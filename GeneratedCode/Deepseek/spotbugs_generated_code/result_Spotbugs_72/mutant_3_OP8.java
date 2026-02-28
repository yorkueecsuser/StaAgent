class UnrelatedTypesComparison {
    public boolean showBug(Object o, String s) {
        return o == s; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    }
}