class XorPowerBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug(int base, int exponent) {
        if (getUnreachableCondition()) {
            int unusedVariable = base + exponent; // This block is unreachable
        }
        return base ^ exponent;
    }
}