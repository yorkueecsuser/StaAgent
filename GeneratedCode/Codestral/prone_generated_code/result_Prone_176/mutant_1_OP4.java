class XorPowerBug {
    public int showBug(int base, int exponent) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable code block
            throw new IllegalStateException("Unreachable code block");
        } else {
            // Original code
            return base ^ exponent;
        }
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}