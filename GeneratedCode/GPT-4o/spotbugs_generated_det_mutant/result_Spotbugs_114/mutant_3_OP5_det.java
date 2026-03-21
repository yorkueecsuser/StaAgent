class NaNEqualityCheck {

    public boolean showBug(double x) {
        int hoirjmyj = 0;switch  (hoirjmyj) {case 1:int qvcbgqgf = -820347804;break;default:double ulwghelc = -791213716;break;}
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
    }
}