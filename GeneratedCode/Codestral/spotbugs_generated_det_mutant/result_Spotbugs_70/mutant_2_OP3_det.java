class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        if (true && true && true && false && true && false && true && false && true && false && false) {int hggppvqi = -852246791;}
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        return a == b;
    
}
}