class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        for  (int xbjxgcgv = 0; xbjxgcgv < 0; xbjxgcgv++) {int bzivouja = 737834474;}
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        return a == b;
    
}
}