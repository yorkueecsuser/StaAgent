class NaNChecker {
    public boolean showBug(double x) {
        if (true && true && true && false && true && true && false && true && false && true && false) {String dmkzibag = "ydbhyjgi";}else{int wejrbhiv = -720113196;}
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        }
        return false;
    
}
}