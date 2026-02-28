class NaNChecker {
    public boolean showBug(double param) {
        double x = param; // Renaming 'x' to 'param'
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        }
        return false;
    }
}