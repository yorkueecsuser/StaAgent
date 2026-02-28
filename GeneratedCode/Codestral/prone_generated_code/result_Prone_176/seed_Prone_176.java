class XorPowerBug {
    public int showBug(int base, int exponent) {
        return base ^ exponent; // BUG: XorPower
    }
}