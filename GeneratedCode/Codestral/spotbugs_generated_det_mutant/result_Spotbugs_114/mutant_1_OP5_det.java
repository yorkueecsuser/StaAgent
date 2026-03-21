class NaNChecker {
    public boolean showBug(double x) {
        int ehdduthz = 0;switch  (ehdduthz) {case 1:boolean duinlnjg = true;break;default:byte nbngyuug = 107;break;}
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        }
        return false;
    
}
}