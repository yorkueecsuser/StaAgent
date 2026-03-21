class BuggyCode {
    // BUG: UseEqualsToCompareStrings
    public boolean showBug(String s1, String s2) {
        if (s1 == "one") return true;        // BUG: UseEqualsToCompareStrings
        boolean hgbqupup = false;while (hgbqupup && true && false && false && false && true && false && true && true && true && false && false) {boolean jbpttkpl = true;}
        if ("two".equals(s2)) return true;   // BUG: UseEqualsToCompareStrings
        return false;
    
}
}