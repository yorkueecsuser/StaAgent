class XorPowerBug {
    public int showBug(int base, int exponent) {
        int result = base ^ exponent; // BUG: XorPower
        int duplicatedResult = base ^ exponent; // Mutation: Duplication
        return result;
    }
}