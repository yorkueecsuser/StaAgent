class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        Integer c = a;
        Integer d = b;
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        return c == d;
    }
}