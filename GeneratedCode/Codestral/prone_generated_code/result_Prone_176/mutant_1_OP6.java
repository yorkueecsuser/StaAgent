class XorPowerBug {
    public int showBug(int base, int exponent) {
        boolean shouldRun = getCondition();
        for (int i = 0; shouldRun; i++) { /* This loop is unreachable due to the'shouldRun' condition being false */
            // Do nothing
        }
        return base ^ exponent;
    }

    private boolean getCondition() {
        return false; // Always false to ensure the loop is unreachable
    }
}