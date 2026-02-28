class NaNChecker {
    public boolean showBug(double x) {
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        }
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) { // Mutant: Unreachable while loop
            // This loop is unreachable because the condition is always false
        }
        return false;
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}