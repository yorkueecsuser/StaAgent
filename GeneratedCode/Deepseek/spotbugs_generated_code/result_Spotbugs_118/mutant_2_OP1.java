class BuggyCode {
    public boolean showBug(Object obj) {
        // Added a dead store
        int deadStore = 0;
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        return obj instanceof String;
    }
}