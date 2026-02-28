class SuspiciousReferenceComparison {
    public boolean showBug(Integer x, Integer y) {
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        return x == y;
    }
}