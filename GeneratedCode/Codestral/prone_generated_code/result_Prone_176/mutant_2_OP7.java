class XorPowerBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug(int base, int exponent) {
        while (getUnreachableCondition()) {
            // Unreachable code
            System.out.println("This loop should never execute.");
        }
        return base ^ exponent;
    }
}