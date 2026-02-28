class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
        int deadStoreVariable; // Dead store mutation: unused variable declaration
        return obj == str; // Original bug: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    }
}