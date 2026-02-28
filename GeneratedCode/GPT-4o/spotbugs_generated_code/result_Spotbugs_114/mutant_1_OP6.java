class NaNEqualityCheck {

    public boolean showBug(double x) {
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        } else {
            // Introduce an unreachable for loop
            boolean conditionFor = getCondition(); // Non-final variable to prevent compile-time unreachable code
            for (int i = 0; conditionFor; i++) {
                System.out.println("This is an unreachable loop iteration.");
            }
            return false;
        }
    }

    private boolean getCondition() {
        return false; // This ensures the for loop is unreachable
    }

    public static void main(String[] args) {
        NaNEqualityCheck checker = new NaNEqualityCheck();
        double value = Double.NaN;

        boolean result = checker.showBug(value);
        System.out.println("Is the value NaN? " + result);
    }
}