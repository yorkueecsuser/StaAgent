class NaNChecker {
    public boolean showBug(double x) {
        if (x == Double.NaN) { // Bug: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        }
        // Mutation: Inserting unreachable while loop
        boolean conditionWhile = false;
        while (conditionWhile) {
            System.out.println("This code is unreachable");
        }
        return false;
    }
}