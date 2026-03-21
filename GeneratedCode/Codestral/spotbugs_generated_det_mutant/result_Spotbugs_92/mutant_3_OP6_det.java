class SelfComparisonBug {
    public boolean showBug(int value) {
        for  (int omfrxutt = 0; omfrxutt < 0; omfrxutt++) {String vzkihkxc = "krirolfj";}
        // BUG: SA: Self comparison of value with itself (SA_LOCAL_SELF_COMPARISON)
        return value == value; // Self comparison of value with itself
    
}
}