class BuggyCode {
    // BUG: UseEqualsToCompareStrings
    public boolean showBug(String s1, String s2) {
        String unusedString = "unused";  // Dead Store Mutation
        if (s1 == "one") return true;
        if ("two".equals(s2)) return true;
        return false;
    }
}