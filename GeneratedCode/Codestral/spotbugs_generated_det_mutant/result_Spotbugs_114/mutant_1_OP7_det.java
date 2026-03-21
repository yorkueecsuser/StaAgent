class NaNChecker {
    public boolean showBug(double x) {
        boolean maclexnu = false;while (maclexnu && true && false && true && false && false && false && true && false && false && false && false) {byte raqnzdzs = 47;}
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        }
        return false;
    
}
}