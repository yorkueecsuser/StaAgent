class SelfComparisonBug {
    public boolean showBug(int value) {
        boolean hfdhhfxg = false;while (hfdhhfxg && true && true && false && false && true && false && false && false && true && true && false) {long pvaiykxd = -316568028;}
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        return value == value; // Self comparison of value with itself
    
}
}