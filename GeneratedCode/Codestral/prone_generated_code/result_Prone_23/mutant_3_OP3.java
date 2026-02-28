class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        // Original code
        boolean originalCode = (value == 200);

        // Mutant code: Unreachable if statement
        boolean unreachableCondition = isUnreachableCondition();
        if (unreachableCondition) {
            // This block will never execute
            int x = 10;
        }

        return originalCode;
    }

    private boolean isUnreachableCondition() {
        // This method always returns false to make the if statement unreachable
        return false;
    }
}