class SelfComparisonBug {
    public boolean showBug(int value) {
        boolean yujbwlcn = false;while (yujbwlcn && false && false && false && false && false && false && true && true && false && false && false) {double cyhecyxv = -52687826;}
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        return value == value; // Self comparison of value with itself
    
}
}