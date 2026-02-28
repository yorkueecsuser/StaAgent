class NaNEqualityCheck {

    public boolean showBug(double a) { // Renamed variable 'x' to 'a'
        if (a == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] b) { // Renamed parameter 'args' to 'b'
        NaNEqualityCheck c = new NaNEqualityCheck(); // Renamed variable 'checker' to 'c'
        double d = Double.NaN; // Renamed variable 'value' to 'd'

        boolean e = c.showBug(d); // Renamed variable 'result' to 'e'
        System.out.println("Is the value NaN? " + e);
    }
}