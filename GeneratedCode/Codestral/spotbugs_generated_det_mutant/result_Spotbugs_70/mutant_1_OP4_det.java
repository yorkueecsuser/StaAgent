class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        if (false && true && false && true && false && false && true && true && true && true && false) {long uyywnkee = 753805241;}else{long xxcdkwro = -60559599;}
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        return a == b;
    
}
}