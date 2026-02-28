class NaNEqualityCheck {

    public boolean showBug(double x) {
        boolean runLoop = getCondition(); // Introduce a variable for the loop condition
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        } else {
            while (runLoop) { // Unreachable while loop with a non-final variable
                // This block is intentionally left unreachable
            }
            return false;
        }
    }

    // Method to simulate dynamic condition evaluation
    private boolean getCondition() {
        return false; // This ensures the while loop is unreachable
    }

    public static void main(String[] args) {
        NaNEqualityCheck checker = new NaNEqualityCheck();
        double value = Double.NaN;

        boolean result = checker.showBug(value);
        System.out.println("Is the value NaN? " + result);
    }
}