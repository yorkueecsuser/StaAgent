class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        char bvohgvxf = 's';
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        return a == b;
    
}
}