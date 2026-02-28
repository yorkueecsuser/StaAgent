class SuspiciousReferenceComparison {
    public boolean showBug(Integer a, Integer b) {
        // Original bug
        boolean result = (a == b);

        // Mutant: Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // This block is unreachable
            throw new RuntimeException("This line should be unreachable");
        } else {
            // This else block is also unreachable
            // But it's safe to keep it for compilation
            return true;
        }

        return result;
    }

    // Dummy method to avoid compile-time constants
    private boolean getUnreachableCondition() {
        return false;
    }
}