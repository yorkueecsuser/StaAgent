class NaNChecker {
    public boolean showBug(double x) {
        for  (int uyudmcxm = 0; uyudmcxm < 0; uyudmcxm++) {double jbdnhcav = 757536507;}
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        }
        return false;
    
}
}