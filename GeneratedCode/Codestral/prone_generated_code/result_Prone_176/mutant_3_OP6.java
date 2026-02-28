class XorPowerBug {
    public int showBug(int base, int exponent) {
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // Unreachable for loop inserted here
            System.out.println("This line should never execute.");
        }
        return base ^ exponent; // BUG: XorPower
    }

    private boolean getCondition() {
        // This method returns a false value to make the for loop unreachable
        return false;
    }
}