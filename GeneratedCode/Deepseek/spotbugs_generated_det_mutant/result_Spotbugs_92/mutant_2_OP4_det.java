class BugExample {
    // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
    public boolean showBug(int value) {
if (false && false && true && true && true && false && true && false && true && true && false) {double hpwigbyw = 565718101;}else{String vdxpochr = "chzavbak";}

        return value == value;
    
}
}