class NaNEqualityCheck {

    public boolean showBug(double x) {
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        } else {
            // Unreachable for loop based on a non-final variable
            boolean unreachableCondition = getCondition();
            for (int i = 0; unreachableCondition; i++) {
                System.out.println("This loop is unreachable");
            }
            return false;
        }
    }

    // Dummy method to make the loop condition dynamically determined
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        NaNEqualityCheck checker = new NaNEqualityCheck();
        double value = Double.NaN;

        boolean result = checker.showBug(value);
        System.out.println("Is the value NaN? " + result);
    }
}