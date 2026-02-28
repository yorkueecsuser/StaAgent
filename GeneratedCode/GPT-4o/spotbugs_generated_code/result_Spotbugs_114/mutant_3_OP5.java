class NaNEqualityCheck {

    public boolean showBug(double x) {
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        NaNEqualityCheck checker = new NaNEqualityCheck();
        double value = Double.NaN;

        boolean result = checker.showBug(value);
        System.out.println("Is the value NaN? " + result);

        // Adding an unreachable switch statement using a method call to ensure it evaluates to false
        int unreachableSwitchValue = getUnreachableSwitchValue();
        switch (unreachableSwitchValue) {
            case 1:
                System.out.println("Case 1");
                break;
            case 2:
                System.out.println("Case 2");
                break;
            default:
                System.out.println("Default case");
                break;
        }
    }

    // Method to return a value that ensures the switch statement is unreachable
    public static int getUnreachableSwitchValue() {
        return 0; // Ensures no case executes
    }
}