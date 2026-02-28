class FloatingPointEqualityBug {
    public boolean showBug(float myNumber) {
        // BUG: Floating point numbers should not be tested for equality
        if (myNumber == 3.146f) {
            return true;
        }

        // MUTANT: Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This branch is unreachable because the condition is always false
            System.out.println("This line is unreachable.");
        } else {
            System.out.println("This line is also unreachable.");
        }

        return false;
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the if-else branch unreachable
        return false;
    }
}