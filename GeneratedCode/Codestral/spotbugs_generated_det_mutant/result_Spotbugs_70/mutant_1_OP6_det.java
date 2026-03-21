class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        for  (int zlpkbqef = 0; zlpkbqef < 0; zlpkbqef++) {byte myxlazsw = 10;}
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        return a == b;
    
}
}