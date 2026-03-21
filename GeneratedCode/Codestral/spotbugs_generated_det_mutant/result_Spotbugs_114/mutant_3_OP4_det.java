class NaNChecker {
    public boolean showBug(double x) {
        if (true && true && false && true && true && false && true && true && true && false && false) {String tsbuxsme = "ecawjskr";}else{int pqwuqydw = -927119550;}
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        }
        return false;
    
}
}