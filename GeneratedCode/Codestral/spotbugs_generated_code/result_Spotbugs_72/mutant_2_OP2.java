class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
        return obj == str; // Original bug
        return obj == str; // Mutated code: Duplication of the bug
    }
}