class XorPowerBug {
    public int showBug(int base, int exponent) {
        int deadStoreVariable = 0; // added dead store variable
        return base ^ exponent; // BUG: XorPower
    }
}