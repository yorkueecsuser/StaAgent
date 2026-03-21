class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        int ytgedbym = 0;switch  (ytgedbym) {case 1:byte puuuschh = -51;break;default:float vlbbrouy = 48923857;break;}
        // BUG: RC: Suspicious reference comparison (RC_REF_COMPARISON)
        return a == b;
    
}
}