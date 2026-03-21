class NaNChecker {
    public boolean showBug(double x) {
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        }
        boolean conditionWhile = false;
        while (conditionWhile) { // Unreachable while loop
            System.out.println("This line should never be executed.");
        }
        return false;
    }
}