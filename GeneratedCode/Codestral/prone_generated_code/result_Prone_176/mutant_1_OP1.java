class XorPowerBug {
    public int showBug(int base, int exponent) {
        int deadStoreVariable; // Dead Store Mutant
        return base ^ exponent;
    }
}