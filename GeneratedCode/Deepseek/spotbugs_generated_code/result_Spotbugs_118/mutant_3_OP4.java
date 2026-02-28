class BuggyCode {
    public boolean showBug(Object obj) {
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        boolean condition = false;
        if (condition) {
            // Unreachable branch
            return true;
        } else {
            return obj instanceof String;
        }
    }
}