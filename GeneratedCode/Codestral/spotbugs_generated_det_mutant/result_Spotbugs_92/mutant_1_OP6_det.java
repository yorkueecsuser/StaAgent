class SelfComparisonBug {
    public boolean showBug(int value) {
        for  (int yuhwwuop = 0; yuhwwuop < 0; yuhwwuop++) {int jcgjywfa = 143333438;}
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        return value == value; // Self comparison of value with itself
    
}
}