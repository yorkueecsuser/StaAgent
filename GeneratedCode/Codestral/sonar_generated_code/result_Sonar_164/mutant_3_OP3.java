class FloatingPointEqualityBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(float myNumber) {
        // BUG: Floating point numbers should not be tested for equality
        if (myNumber == 3.146f) {
            return true;
        }

        // Mutation: Inserting unreachable if branch
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This branch is unreachable, so it will never execute
            throw new RuntimeException("Unreachable code executed");
        }

        return false;
    }
}