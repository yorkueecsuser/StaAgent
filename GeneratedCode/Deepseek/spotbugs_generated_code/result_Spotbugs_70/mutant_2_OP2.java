class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        // Original buggy code
        return a == b;

        // Mutated code
        Integer aDuplicate = a;
        return aDuplicate == b;
    }
}