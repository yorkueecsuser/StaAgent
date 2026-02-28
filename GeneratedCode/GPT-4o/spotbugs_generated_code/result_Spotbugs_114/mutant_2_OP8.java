class NaNEqualityCheck {

    public boolean showBug(double y) { // Renamed variable x to y
        if (y == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        NaNEqualityCheck checker = new NaNEqualityCheck();
        double z = Double.NaN; // Renamed variable value to z

        boolean result = checker.showBug(z);
        System.out.println("Is the value NaN? " + result);
    }
}