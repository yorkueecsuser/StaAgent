class SelfComparisonBug {
    public boolean showBug(int value) {
        if (true && true && false && false && false && true && true && true && true && true && false) {long agixpblk = 109298915;}else{int qggahtlu = -542819102;}
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        return value == value; // Self comparison of value with itself
    
}
}