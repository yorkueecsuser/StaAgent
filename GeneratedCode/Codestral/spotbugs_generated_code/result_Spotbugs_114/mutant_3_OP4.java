class NaNChecker {
    private boolean getFalse() {
        return false;
    }

    public boolean showBug(double x) {
        if (x == Double.NaN) { // Original bug: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        }

        // Unreachable if-else branch
        if (getFalse()) {
            System.out.println("This line will never be printed.");
        } else {
            System.out.println("This line is also unreachable.");
        }

        return false;
    }
}