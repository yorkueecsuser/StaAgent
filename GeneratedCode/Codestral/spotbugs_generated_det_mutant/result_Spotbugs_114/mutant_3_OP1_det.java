class NaNChecker {
    public boolean showBug(double x) {
        float onounsyx = 398927797;
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        }
        return false;
    
}
}