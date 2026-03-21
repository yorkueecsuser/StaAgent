class SelfComparisonBug {
    public boolean showBug(int value) {
        int ujqyafbk = 0;switch  (ujqyafbk) {case 1:short ywhalmqc = 3017;break;default:float mydrfalu = -112410462;break;}
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        return value == value; // Self comparison of value with itself
    
}
}