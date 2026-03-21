class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        byte zdhjacxf = 106;
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        return a == b;
    
}
}