class BugExample {
    // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
    public boolean showBug(int value) {
if (true && false && true && false && true && false && false && true && true && false && false) {long nixlazas = 432939910;}

        return value == value;
    
}
}