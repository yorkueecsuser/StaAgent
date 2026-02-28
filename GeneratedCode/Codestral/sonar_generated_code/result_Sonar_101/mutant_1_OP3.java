class UnreachableCodeBug {
    public int showBug(boolean a, boolean b) {
        int result = 0;
        if (!a || b) {
            result = 1;
        } else {
            result = 2;
        }

        // Mutant code: Unreachable if statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This branch will never be executed because getUnreachableCondition() always returns false
            result = 3;
        }

        return result;
    }

    // Helper method to return false for the unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }
}