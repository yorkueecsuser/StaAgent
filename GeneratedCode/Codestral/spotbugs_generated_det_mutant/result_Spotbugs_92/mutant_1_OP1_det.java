class SelfComparisonBug {
    public boolean showBug(int value) {
        int plvtrhbu = 499344456;
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        return value == value; // Self comparison of value with itself
    
}
}