class NaNChecker {
    public boolean showBug(double x) {
        boolean prxomzkj = false;while (prxomzkj && false && true && true && false && true && false && true && true && true && false && false) {int emzbqipv = 857261742;}
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        }
        return false;
    
}
}