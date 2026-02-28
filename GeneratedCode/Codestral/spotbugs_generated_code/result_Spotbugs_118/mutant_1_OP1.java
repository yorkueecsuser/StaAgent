class BuggyCode {
    public boolean showBug(Object obj) {
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        String unusedVariable = "deadstore"; // Inserting an unused variable declaration
        return obj instanceof String;
    }
}