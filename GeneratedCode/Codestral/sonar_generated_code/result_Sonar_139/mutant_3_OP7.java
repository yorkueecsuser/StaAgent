class DoubleBug {
    public double showBug(int value) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable loop
            break; // to avoid infinite loop
        }
        // Original code
        return Double.longBitsToDouble((long)value); // Noncompliant - May lead to incorrect value due to interpretation of most significant bit
    }

    private boolean getCondition() {
        return false; // Always false to make it unreachable
    }
}