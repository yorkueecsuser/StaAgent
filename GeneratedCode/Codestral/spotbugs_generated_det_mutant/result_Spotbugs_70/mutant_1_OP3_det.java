class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        if (true && false && true && true && false && true && false && false && true && true && false) {byte pdchxyej = 127;}
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        return a == b;
    
}
}