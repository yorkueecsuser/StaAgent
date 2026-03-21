class BugExample {
    // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
    public boolean showBug(int value) {
boolean hdfwdhrb = false;

        return value == value;
    
}
}