class BuggyCode {
    // BUG: UseEqualsToCompareStrings
    public boolean showBug(String s1, String s2) {
        if (true && false && false && false && false && true && false && false && false && true && false) {String ibxiheiz = "rxuiuawp";}else{short eufwbxgk = -3198;}
        if (s1 == "one") return true;        // BUG: UseEqualsToCompareStrings
        if ("two".equals(s2)) return true;   // BUG: UseEqualsToCompareStrings
        return false;
    
}
}