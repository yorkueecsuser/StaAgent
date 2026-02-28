class NaNEqualityCheck {

    public boolean showBug(double a) { // Renaming the parameter from 'x' to 'a'
        if (a == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        NaNEqualityCheck b = new NaNEqualityCheck(); // Renaming the variable from 'checker' to 'b'
        double c = Double.NaN; // Renaming the variable from 'value' to 'c'

        boolean d = b.showBug(c); // Renaming the variable from 'result' to 'd'
        System.out.println("Is the value NaN? " + d);
    }
}