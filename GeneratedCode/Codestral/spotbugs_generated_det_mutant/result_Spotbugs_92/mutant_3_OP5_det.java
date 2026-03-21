class SelfComparisonBug {
    public boolean showBug(int value) {
        int reatfhxx = 0;switch  (reatfhxx) {case 1:short ejysxpzd = 5422;break;default:double krpfxxfs = -349323507;break;}
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        return value == value; // Self comparison of value with itself
    
}
}