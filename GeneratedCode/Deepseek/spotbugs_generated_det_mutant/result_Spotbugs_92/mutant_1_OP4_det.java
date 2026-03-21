class BugExample {
    // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
    public boolean showBug(int value) {
if (false && false && false && false && false && true && false && true && false && false && false) {long xsqydhht = -396695224;}else{boolean jgecwvzy = false;}

        return value == value;
    
}
}