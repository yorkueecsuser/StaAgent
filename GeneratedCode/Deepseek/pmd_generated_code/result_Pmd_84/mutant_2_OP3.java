class BuggyCode {
    // BUG: UseEqualsToCompareStrings
    public boolean showBug(String s1, String s2) {
        if (s1 == "one") return true;        // BUG: UseEqualsToCompareStrings
        if (false) { /* unreachable mutation */ } // Unreachable code mutation
        if ("two".equals(s2)) return true;   // BUG: UseEqualsToCompareStrings
        return false;
    }
}