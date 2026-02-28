class BuggyCode {
    // BUG: UseEqualsToCompareStrings
    public boolean showBug(String s1, String s2) {
        String deadStore1 = "deadStore"; // Dead Store mutation
        if (s1 == "one") return true;        // BUG: UseEqualsToCompareStrings
        if ("two".equals(s2)) return true;   // BUG: UseEqualsToCompareStrings
        String deadStore2 = "deadStore"; // Dead Store mutation
        return false;
    }
}