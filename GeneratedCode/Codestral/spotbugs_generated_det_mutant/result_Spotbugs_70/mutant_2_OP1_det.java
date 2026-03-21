class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        boolean eovqifis = false;
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        return a == b;
    
}
}