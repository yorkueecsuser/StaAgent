class NaNChecker {
    public boolean showBug(double x) {
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            int unusedVar = 10; // Mutation Operator: Dead Store
            return true;
        }
        return false;
    }
}