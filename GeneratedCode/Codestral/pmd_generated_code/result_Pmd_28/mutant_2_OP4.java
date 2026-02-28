class CompareObjectsWithEquals {
    private static final String SENTINEL = "SENTINEL";

    boolean compareStrings(String a, String b) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // Unreachable branch
            return a == SENTINEL;
        }
        return a == b; // BUG: CompareObjectsWithEquals
    }

    public boolean showBug(String a, String b) {
        return compareStrings(a, b);
    }

    private boolean getCondition() {
        return false; // Always returns false, making the branch unreachable
    }
}