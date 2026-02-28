class NaNChecker {
    public boolean showBug(double x) {
        double y = x; // Mutated code: Renaming x to y
        if (y == Double.NaN) { // Original bug remains: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        }
        return false;
    }
}