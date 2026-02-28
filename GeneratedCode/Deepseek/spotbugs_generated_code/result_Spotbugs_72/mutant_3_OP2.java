class UnrelatedTypesComparison {
    public boolean showBug(Object obj, String str) {
        return obj == str; // Original bug
        return obj == str; // Mutant: Duplication of the original bugging line
    }
}