class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
        int deadStoreVariable; // Mutation: Dead Store mutation operator added this line
        return obj == str; // BUG: EC: Using pointer equality to compare different types (EC_UNRELATED_TYPES_USING_POINTER_EQUALITY)
    }
}