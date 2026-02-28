class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        int deadStore = 10; // Dead store mutation
        return a == b;
    }
}