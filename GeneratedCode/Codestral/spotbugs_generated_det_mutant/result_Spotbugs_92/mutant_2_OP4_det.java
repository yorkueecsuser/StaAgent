class SelfComparisonBug {
    public boolean showBug(int value) {
        if (true && false && false && false && true && true && false && true && false && true && false) {byte yqjdvgon = -41;}else{int ndqwbkha = 448454068;}
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        return value == value; // Self comparison of value with itself
    
}
}