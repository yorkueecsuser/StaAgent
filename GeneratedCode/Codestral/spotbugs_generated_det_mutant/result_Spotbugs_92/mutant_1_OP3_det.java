class SelfComparisonBug {
    public boolean showBug(int value) {
        if (true && true && true && false && true && true && false && false && true && true && false) {int okoihlsx = -776122577;}
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        return value == value; // Self comparison of value with itself
    
}
}