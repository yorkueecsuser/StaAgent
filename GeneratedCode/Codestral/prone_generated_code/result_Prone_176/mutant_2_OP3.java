class XorPowerBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug(int base, int exponent) {
        if (getUnreachableCondition()) {
            // Unreachable if statement
            throw new RuntimeException("This statement should never be reached.");
        }
        return base ^ exponent;
    }
}