class SelfComparisonBug {
    public boolean showBug(int value) {
        if (false && true && true && true && false && true && true && true && false && false && false) {char scycigdr = 'v';}else{byte otruntrk = -6;}
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        return value == value; // Self comparison of value with itself
    
}
}