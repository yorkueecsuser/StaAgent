class NaNEqualityCheck {

    public boolean showBug(double x) {
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        } else {
            boolean unreachableCondition = getUnreachableCondition(); // Introduce a dynamically determined condition
            if (unreachableCondition) { // Unreachable if statement
                System.out.println("This code is unreachable.");
            }
            return false;
        }
    }

    // Method to ensure the condition is determined at runtime
    private boolean getUnreachableCondition() {
        return false; // This makes the condition always false at runtime
    }

    public static void main(String[] args) {
        NaNEqualityCheck checker = new NaNEqualityCheck();
        double value = Double.NaN;

        boolean result = checker.showBug(value);
        System.out.println("Is the value NaN? " + result);
    }
}