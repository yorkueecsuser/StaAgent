class XorPowerBug {
    public int showBug(int base, int exponent) {
        int exp = exponent; // Renaming mutant
        return base ^ exp; // BUG: XorPower
    }
}