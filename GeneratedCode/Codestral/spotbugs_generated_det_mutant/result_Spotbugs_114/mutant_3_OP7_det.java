class NaNChecker {
    public boolean showBug(double x) {
        boolean ptltvmrv = false;while (ptltvmrv && false && true && false && true && true && false && false && false && false && true && false) {char tdqcnlsv = 'i';}
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        }
        return false;
    
}
}