class BuggyCode {
    private boolean shouldRun = getCondition();

    public boolean showBug(String s1, String s2) {
        if (s1 == "one") return true;        // BUG: UseEqualsToCompareStrings
        if ("two".equals(s2)) return true;   // BUG: UseEqualsToCompareStrings

        // Unreachable if-else statement mutation
        if (false) {
            System.out.println("This code is unreachable due to mutation");
            return false;
        }

        return false;
    }

    private boolean getCondition() {
        // This method ensures that the condition is non-final and can be dynamically determined at runtime
        return!shouldRun;
    }
}