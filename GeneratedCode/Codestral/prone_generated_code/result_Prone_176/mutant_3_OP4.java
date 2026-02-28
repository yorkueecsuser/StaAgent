class XorPowerBug {
    public int showBug(int base, int exponent) {
        boolean shouldRun = getUnreachableCondition();
        if (shouldRun) {
            // Unreachable code
            throw new RuntimeException("This code should not be executed");
        } else {
            // Original code
            return base ^ exponent;
        }
    }

    private boolean getUnreachableCondition() {
        // This method always returns false, making the if-else branch unreachable
        return false;
    }
}