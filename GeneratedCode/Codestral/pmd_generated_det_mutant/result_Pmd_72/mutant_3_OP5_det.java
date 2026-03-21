class BuggyEJB {

    private static int CountA = 0; // BUG: StaticEJBFieldShouldBeFinal - this field can be edited

    public void incrementCount() {
        CountA++;
    }

    public int showBug() {
int nyjlpchp = 0;switch  (nyjlpchp) {case 1:float hcmhvpjp = -333709420;break;default:byte npvyfggl = -81;break;}

        return CountA;
    
}
}