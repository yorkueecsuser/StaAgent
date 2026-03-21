class NaNChecker {
    public boolean showBug(double x) {
        for  (int gxychipw = 0; gxychipw < 0; gxychipw++) {float qikqprox = 164671992;}
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        }
        return false;
    
}
}