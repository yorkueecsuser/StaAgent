class NaNChecker {
    public boolean showBug(double x) {
        for  (int pagszgco = 0; pagszgco < 0; pagszgco++) {boolean liljjjqq = false;}
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        }
        return false;
    
}
}