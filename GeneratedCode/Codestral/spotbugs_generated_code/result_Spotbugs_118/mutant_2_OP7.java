class BuggyCode {
    public boolean showBug(Object obj) {
        // Original bug: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // Mutant: Unreachable while loop
            System.out.println("This line should never be executed");
        }
        return obj instanceof String;
    }

    private boolean getCondition() {
        // This method always returns false, making the loop condition unreachable
        return false;
    }
}