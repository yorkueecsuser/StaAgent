class XorPowerBug {
    private boolean getFalseCondition() {
        return false;
    }

    public int showBug(int base, int exponent) {
        boolean condition = getFalseCondition();
        for (int i = 0; condition; i++) {
            // Unreachable code
            System.out.println("This is an unreachable loop.");
        }
        return base ^ exponent;
    }
}