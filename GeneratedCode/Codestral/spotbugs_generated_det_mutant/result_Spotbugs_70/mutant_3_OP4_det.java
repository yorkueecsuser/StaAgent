class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        if (false && false && false && true && true && true && false && false && false && true && false) {long mwyzttke = -158922321;}else{boolean njsvmrat = true;}
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        return a == b;
    
}
}