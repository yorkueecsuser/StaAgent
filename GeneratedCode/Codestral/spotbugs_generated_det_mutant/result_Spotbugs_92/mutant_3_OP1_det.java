class SelfComparisonBug {
    public boolean showBug(int value) {
        int zftcbcfu = 254243798;
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        return value == value; // Self comparison of value with itself
    
}
}