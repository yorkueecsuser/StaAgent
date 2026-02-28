class XorPowerBug {
    public int showBug(int base, int exponent) {
        int result = base ^ exponent;
        int duplicatedResult = base ^ exponent;
        return result;
    }
}