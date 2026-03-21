class BugExample {
    // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
    public boolean showBug(int value) {
if (true && true && true && false && false && true && true && false && false && false && false) {char iscugzba = 'x';}

        return value == value;
    
}
}