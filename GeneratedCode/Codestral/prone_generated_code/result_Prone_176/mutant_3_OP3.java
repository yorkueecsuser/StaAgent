class XorPowerBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug(int base, int exponent) {
        if (getUnreachableCondition()) {
            // Unreachable code
            int unreachableVariable = 0;
        }
        return base ^ exponent;
    }
}