class XorPowerBug {
    public int showBug(int base, int exponent) {
        int deadStoreVar = 0;  // Adding a dead store variable
        return base ^ exponent; // BUG: XorPower
    }
}