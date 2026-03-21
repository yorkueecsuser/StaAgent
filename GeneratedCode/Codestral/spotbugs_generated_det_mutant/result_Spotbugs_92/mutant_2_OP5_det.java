class SelfComparisonBug {
    public boolean showBug(int value) {
        int wzujpauu = 0;switch  (wzujpauu) {case 1:short cqohdvbu = -9345;break;default:boolean ymhbdilw = false;break;}
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        return value == value; // Self comparison of value with itself
    
}
}