class BuggyCode {
    public boolean showBug(Object obj) {
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        // Mutation Operator: Equivalent Loop Replacement
        // Mutant code: Replace the instanceof check with a do-while loop that always returns false
        boolean result = false;
        do {
            result = obj instanceof String;
        } while (false);
        return result;
    }
}