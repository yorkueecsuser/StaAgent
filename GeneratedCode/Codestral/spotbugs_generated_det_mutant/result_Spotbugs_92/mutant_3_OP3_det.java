class SelfComparisonBug {
    public boolean showBug(int value) {
        if (false && true && false && false && true && true && false && false && false && true && false) {String pglmrwve = "eqbqbpbw";}
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        return value == value; // Self comparison of value with itself
    
}
}