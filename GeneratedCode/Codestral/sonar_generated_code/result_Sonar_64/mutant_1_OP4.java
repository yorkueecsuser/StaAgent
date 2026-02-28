class BuggyExceptionCreation {
    private boolean getUnreachableCondition() {
        return false; // Method to ensure the condition is determined at runtime and not a compile-time constant
    }

    public void showBug(int x) {
        if (x < 0)
            new IllegalArgumentException("x must be nonnegative");

        // Mutant code: Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This branch is unreachable, as the condition is always false
            System.out.println("This line will never be executed");
        } else {
            // This else branch is also unreachable, as the condition is always false
            System.out.println("This line will also never be executed");
        }
    }
}