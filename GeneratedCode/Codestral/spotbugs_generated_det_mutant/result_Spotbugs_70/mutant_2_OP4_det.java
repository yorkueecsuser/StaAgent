class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        if (true && false && true && false && false && true && true && true && false && false && false) {byte etfwklnm = -121;}else{double sawdoimz = 156101862;}
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        return a == b;
    
}
}