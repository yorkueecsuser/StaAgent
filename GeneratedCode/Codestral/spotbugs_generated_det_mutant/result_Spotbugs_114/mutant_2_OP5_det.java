class NaNChecker {
    public boolean showBug(double x) {
        int pfwbjlpx = 0;switch  (pfwbjlpx) {case 1:short bdknyubq = 3502;break;default:boolean owccnbxp = false;break;}
        if (x == Double.NaN) { // BUG: FE: Doomed test for equality to NaN (FE_TEST_IF_EQUAL_TO_NOT_A_NUMBER)
            return true;
        }
        return false;
    
}
}