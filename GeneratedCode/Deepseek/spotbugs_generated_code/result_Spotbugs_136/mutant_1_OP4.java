class BuggyCode {

    public boolean showBug(boolean input) {
        // Original bug
        if (input = true) { // The '=' is a mistake, this should be '=='
            return true;
        }

        // Mutation: Unreachable if-else statement
        boolean mutantCondition = false; // Using a variable to avoid a compile-time constant
        if (mutantCondition) {
            System.out.println("This is an unreachable statement");
        } else {
            System.out.println("This is reachable");
        }

        return false;
    }
}