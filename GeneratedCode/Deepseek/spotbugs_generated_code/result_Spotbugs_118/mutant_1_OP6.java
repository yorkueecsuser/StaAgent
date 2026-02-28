class BuggyCode {
    public boolean showBug(Object obj) {
        boolean condition = false;
        for (int i = 0; condition; i++) {
            // Unreachable for loop inserted here
        }
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        return obj instanceof String;
    }

    private boolean getCondition() {
        return false;
    }
}