class NaNChecker {
    public boolean showBug(double x) {
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        }
        // Mutated code added below
        if (x == Double.NaN) {
            return true;
        }
        // End of mutated code
        return false;
    }
}