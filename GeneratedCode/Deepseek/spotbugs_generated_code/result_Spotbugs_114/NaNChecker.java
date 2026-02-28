class NaNChecker {
    public boolean showBug(double x) {
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        }
        return false;
    }

    // Mutated Code: Equivalent Loop Replacement
    public void doomedTest() {
        double x = Double.NaN;
        do {
            if (x == Double.NaN) {
                System.out.println("This code will never execute.");
            }
        } while (x == Double.NaN); // This loop will run once and then terminate because x == Double.NaN always evaluates to false.
    }
}