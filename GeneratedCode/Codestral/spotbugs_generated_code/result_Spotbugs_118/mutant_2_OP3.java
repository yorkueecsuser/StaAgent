class BuggyCode {
    public boolean showBug(Object obj) {
        // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        boolean shouldRun = false; // This condition is always false to make the branch unreachable
        if (shouldRun) {
            // This block of code will never be executed due to the false condition
            int x = 10 / 0; // This line will never be executed, but it's added to avoid compile-time errors
        }
        return obj instanceof String;
    }
}