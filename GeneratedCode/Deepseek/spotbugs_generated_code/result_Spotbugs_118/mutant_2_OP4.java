class BuggyCode {
    public boolean showBug(Object obj) {
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        boolean unreachableCondition = false; // Unreachable condition

        if (unreachableCondition) {
            // This block will never be executed
            System.out.println("This line should never be printed.");
        } else {
            // Original code
            return obj instanceof String;
        }
    }
}