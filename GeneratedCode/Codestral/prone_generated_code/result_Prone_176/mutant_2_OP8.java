class XorPowerBug {
    public int showBug(int base, int exponent) {
        int e = exponent; // Mutant code: Renaming 'exponent' to 'e'
        return base ^ e; // BUG: XorPower
    }
}