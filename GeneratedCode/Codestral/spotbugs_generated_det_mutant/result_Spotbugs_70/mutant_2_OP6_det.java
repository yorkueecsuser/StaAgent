class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        for  (int fwtkroqk = 0; fwtkroqk < 0; fwtkroqk++) {boolean wjrwgxut = true;}
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        return a == b;
    
}
}