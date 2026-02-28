class BuggyCode {
    public boolean showBug(Object obj) {
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        int unusedVar = 10; // Dead Store mutation
        return obj instanceof String;
    }
}