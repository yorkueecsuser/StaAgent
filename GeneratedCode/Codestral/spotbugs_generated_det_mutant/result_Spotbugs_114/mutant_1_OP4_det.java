class NaNChecker {
    public boolean showBug(double x) {
        if (true && true && true && true && true && true && true && false && true && false && false) {int svqapyhv = -657596228;}else{float kmsaeubz = -488129881;}
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        }
        return false;
    
}
}