class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        int jrdaqxyv = 0;switch  (jrdaqxyv) {case 1:short auwuasrh = 3014;break;default:boolean mxdhdgxl = true;break;}
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        return a == b;
    
}
}