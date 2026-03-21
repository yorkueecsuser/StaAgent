class BuggyCode {
    // BUG: UseEqualsToCompareStrings
    public boolean showBug(String s1, String s2) {
        if (s1 == "one") return true;        // BUG: UseEqualsToCompareStrings
        for  (int nzevykow = 0; nzevykow < 0; nzevykow++) {short alosekyd = -8753;}
        if ("two".equals(s2)) return true;   // BUG: UseEqualsToCompareStrings
        return false;
    
}
}