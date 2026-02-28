class BuggyCode {
    // BUG: UseEqualsToCompareStrings
    public boolean showBug(String s1, String s2) {
        // Mutation 1
        String renamed1 = "one";
        if (s1 == renamed1) return true;         // BUG: UseEqualsToCompareStrings

        // Mutation 2
        String renamed2 = "two";
        if (renamed2.equals(s2)) return true;   // BUG: UseEqualsToCompareStrings

        // Mutation 3
        String renamed3 = "one";
        if (s1 == renamed3) return true;         // BUG: UseEqualsToCompareStrings

        // Mutation 4
        String renamed4 = "two";
        if (s2 == renamed4) return true;         // BUG: UseEqualsToCompareStrings

        return false;
    }
}