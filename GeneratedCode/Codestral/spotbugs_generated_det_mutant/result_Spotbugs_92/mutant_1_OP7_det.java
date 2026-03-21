class SelfComparisonBug {
    public boolean showBug(int value) {
        boolean camwmswa = false;while (camwmswa && false && true && false && false && false && false && false && false && true && true && false) {String wueahtmg = "wxrfeazp";}
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        return value == value; // Self comparison of value with itself
    
}
}