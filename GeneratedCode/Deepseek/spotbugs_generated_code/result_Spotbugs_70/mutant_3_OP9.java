class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        // Mutated code:
        return a!= b;
    }

    // Original code (left intact):
    // return a == b;
}