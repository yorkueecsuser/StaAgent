class BuggyCode {
    public boolean showBug(Object obj) {
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        // Mutant: Unreachable switch statement
        boolean condition = getCondition();
        switch (condition? 1 : 0) {
            case 1:
                return obj instanceof String;
            default:
                throw new IllegalStateException("Unreachable code executed");
        }
    }

    private boolean getCondition() {
        // This method always returns false to make the switch statement unreachable
        return false;
    }
}