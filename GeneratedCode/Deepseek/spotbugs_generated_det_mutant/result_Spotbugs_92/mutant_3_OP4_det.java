class BugExample {
    // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
    public boolean showBug(int value) {
if (false && false && true && false && false && false && false && true && false && false && false) {short uswivabf = 162;}else{boolean zvvnptzy = true;}

        return value == value;
    
}
}