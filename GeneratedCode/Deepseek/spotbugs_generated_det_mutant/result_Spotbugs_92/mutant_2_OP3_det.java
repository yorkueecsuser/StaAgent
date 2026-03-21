class BugExample {
    // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
    public boolean showBug(int value) {
if (true && false && true && true && false && true && false && true && true && true && false) {char srqrbsiy = 'v';}

        return value == value;
    
}
}