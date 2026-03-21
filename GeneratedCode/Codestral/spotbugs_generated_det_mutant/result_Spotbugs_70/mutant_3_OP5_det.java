class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        int uvflzhok = 0;switch  (uvflzhok) {case 1:long eceweemr = -709699109;break;default:float dzyobuwn = -642124222;break;}
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        return a == b;
    
}
}