class BuggyCode {
    public boolean showBug(Object obj) {
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        // MUTATION: Equivalent Loop Replacement
        // Original code does not have any loops, so no mutation is applied here.
        // However, for the sake of demonstration, let's add a do-while loop that doesn't affect the bug.

        do {
            // This loop doesn't affect the bug, just for demonstration.
        } while (false);

        return obj instanceof String;
    }
}