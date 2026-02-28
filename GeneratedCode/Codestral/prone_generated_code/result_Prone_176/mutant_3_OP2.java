class XorPowerBug {
    public int showBug(int base, int exponent) {
        int result = base ^ exponent; // Original code

        // Mutant code: Duplication of the assignment statement
        int duplicateResult = base ^ exponent;

        return result;
    }
}