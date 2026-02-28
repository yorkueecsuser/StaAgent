class NaNChecker {
    public boolean showBug(double x) {
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        }

        // Unreachable switch statement mutant
        int value = -1; // Assuming -1 is not a valid value for x
        switch(value) {
            case (int) Double.doubleToLongBits(x):
                System.out.println("Unreachable statement");
                break;
        }

        return false;
    }
}