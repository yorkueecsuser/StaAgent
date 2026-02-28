class BuggyCode {
    // BUG: UseEqualsToCompareStrings
    public boolean showBug(String s1, String s2) {
        if (s1 == "one") return true;        // BUG: UseEqualsToCompareStrings
        if ("two".equals(s2)) return true;   // BUG: UseEqualsToCompareStrings
        
        // Unreachable if-else statement mutation
        if (false) {
            // Original code
            if (s1 == "one") return true;
        } else {
            // Mutant code
            if (s1 == "two") return true;
        }

        return false;
    }
}