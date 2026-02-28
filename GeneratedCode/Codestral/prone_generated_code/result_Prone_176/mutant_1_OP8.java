class XorPowerBug {
    public int showBug(int base, int exponent) {
        int a = base; // Added mutant
        int b = exponent; // Added mutant
        return a ^ b;
    }
}