class XorPowerBug {
    public int showBug(int base, int exponent) {
        boolean conditionWhile = isConditionFalse();
        while (conditionWhile) {
            // This code is unreachable
            System.out.println("This is an unreachable loop.");
        }
        return base ^ exponent;
    }

    private boolean isConditionFalse() {
        return false; // This ensures the while loop is unreachable
    }
}