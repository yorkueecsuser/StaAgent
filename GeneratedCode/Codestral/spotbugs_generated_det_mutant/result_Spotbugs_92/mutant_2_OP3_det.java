class SelfComparisonBug {
    public boolean showBug(int value) {
        if (true && true && true && true && false && false && true && false && true && false && false) {char vpetegmj = 'i';}
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        return value == value; // Self comparison of value with itself
    
}
}