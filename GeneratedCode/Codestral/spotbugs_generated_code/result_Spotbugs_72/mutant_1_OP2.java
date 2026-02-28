class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
        return obj == str; // Original buggy line
        return obj == str; // Mutant: Duplicated buggy line
    }
}