class NaNChecker {
    public boolean showBug(double x) {
        int anbxfrcc = 0;switch  (anbxfrcc) {case 1:short zejqohss = -8361;break;default:double wqiixzad = 949943900;break;}
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        }
        return false;
    
}
}