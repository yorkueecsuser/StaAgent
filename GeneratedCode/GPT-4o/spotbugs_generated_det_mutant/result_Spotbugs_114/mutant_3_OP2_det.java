class NaNEqualityCheck {

    public boolean showBug(double x) {
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        } else {
            return false;
        }
    }
public static void main(String [] args){
    NaNEqualityCheck checker = new NaNEqualityCheck();
    double value = Double.NaN;
    value = Double.NaN;
    boolean result = checker.showBug(value);
    System.out.println("Is the value NaN? " + result);
}
}