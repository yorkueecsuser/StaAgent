class NaNEqualityCheck {

    public boolean showBug(double x) {
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        } else {
            // Inserting an unreachable switch statement
            int unreachableValue = getUnreachableValue();
            switch (unreachableValue) {
                case 1: 
                    System.out.println("This will never be printed.");
                    break;
                // No case for 0 to make the switch statement unreachable.
            }
            return false;
        }
    }

    // Method to get a value that makes the switch statement unreachable
    private int getUnreachableValue() {
        return 0; // This value ensures the switch never matches a case
    }

    public static void main(String[] args) {
        NaNEqualityCheck checker = new NaNEqualityCheck();
        double value = Double.NaN;

        boolean result = checker.showBug(value);
        System.out.println("Is the value NaN? " + result);
    }
}