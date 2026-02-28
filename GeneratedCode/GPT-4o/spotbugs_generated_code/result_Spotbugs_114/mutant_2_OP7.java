class NaNEqualityCheck {

    public boolean showBug(double x) {
        // Unreachable while loop mutation
        boolean conditionWhile = getFalseCondition(); // Method call ensures condition is non-final
        while (conditionWhile) {
            System.out.println("This will never be reached.");
        }

        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        } else {
            return false;
        }
    }

    // Method to simulate a dynamically determined condition
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        NaNEqualityCheck checker = new NaNEqualityCheck();
        double value = Double.NaN;

        boolean result = checker.showBug(value);
        System.out.println("Is the value NaN? " + result);
    }
}