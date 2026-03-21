class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        if (true && true && true && true && true && true && false && false && false && false && false) {boolean kwkehsyu = false;}
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        return a == b;
    
}
}