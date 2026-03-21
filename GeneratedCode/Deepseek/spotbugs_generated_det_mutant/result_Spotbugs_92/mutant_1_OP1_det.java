class BugExample {
    // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
    public boolean showBug(int value) {
short infayrep = 6110;

        return value == value;
    
}
}