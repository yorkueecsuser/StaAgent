class NaNEqualityCheck {

    public boolean showBug(double x) {
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        } else {
            // Unreachable if-else statement mutation
            boolean dynamicCondition = getDynamicCondition();
            if (dynamicCondition) {
                System.out.println("This condition is always false, thus unreachable.");
            } else {
                System.out.println("This is the else branch of the unreachable statement.");
            }
            return false;
        }
    }

    // Method to simulate a dynamic condition, always returns false
    private boolean getDynamicCondition() {
        return false;
    }

    public static void main(String[] args) {
        NaNEqualityCheck checker = new NaNEqualityCheck();
        double value = Double.NaN;

        boolean result = checker.showBug(value);
        System.out.println("Is the value NaN? " + result);
    }
}