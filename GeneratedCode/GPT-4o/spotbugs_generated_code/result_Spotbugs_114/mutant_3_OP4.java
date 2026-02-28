class NaNEqualityCheck {

    public boolean showBug(double x) {
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        } else {
            boolean condition = getCondition(); // Ensure that this condition is dynamically evaluated
            if (condition) {
                // Unreachable code for demonstration; this block will never run as condition is false
                System.out.println("This is an unreachable if-else block!");
            } else {
                System.out.println("This is the else of the unreachable branch!");
            }
            return false;
        }
    }

    private boolean getCondition() {
        return false; // Return a non-final boolean that makes the branch unreachable
    }

    public static void main(String[] args) {
        NaNEqualityCheck checker = new NaNEqualityCheck();
        double value = Double.NaN;

        boolean result = checker.showBug(value);
        System.out.println("Is the value NaN? " + result);
    }
}