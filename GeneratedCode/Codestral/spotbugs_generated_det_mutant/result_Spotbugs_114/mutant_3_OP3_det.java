class NaNChecker {
    public boolean showBug(double x) {
        if (true && false && false && true && true && true && false && false && false && true && false) {String nsqxszrm = "erluizts";}
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        }
        return false;
    
}
}