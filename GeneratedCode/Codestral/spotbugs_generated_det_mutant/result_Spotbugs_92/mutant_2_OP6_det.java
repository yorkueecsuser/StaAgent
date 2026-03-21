class SelfComparisonBug {
    public boolean showBug(int value) {
        for  (int cpszqcak = 0; cpszqcak < 0; cpszqcak++) {float paouxuct = -782206959;}
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        return value == value; // Self comparison of value with itself
    
}
}