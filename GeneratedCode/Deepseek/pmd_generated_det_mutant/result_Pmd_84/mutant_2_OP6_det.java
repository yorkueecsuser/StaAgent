class BuggyCode {
    // BUG: UseEqualsToCompareStrings
    public boolean showBug(String s1, String s2) {
        for  (int ewrwroir = 0; ewrwroir < 0; ewrwroir++) {float lpegdyrf = 736283880;}
        if (s1 == "one") return true;        // BUG: UseEqualsToCompareStrings
        if ("two".equals(s2)) return true;   // BUG: UseEqualsToCompareStrings
        return false;
    
}
}