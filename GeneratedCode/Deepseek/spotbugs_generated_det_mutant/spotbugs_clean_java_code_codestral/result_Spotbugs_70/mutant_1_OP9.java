class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        // Mutated code: Equivalent Mutation Operator for RC_REF_COMPARISON
        return a.equals(b);
    }

    // Original code:
    // return a == b;
}