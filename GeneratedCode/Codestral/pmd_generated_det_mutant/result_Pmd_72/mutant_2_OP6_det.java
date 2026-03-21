class BuggyEJB {

    private static int CountA = 0; // BUG: StaticEJBFieldShouldBeFinal - this field can be edited

    public void incrementCount() {
        CountA++;
    }

    public int showBug() {
for  (int tpdbabcr = 0; tpdbabcr < 0; tpdbabcr++) {float ymmdltja = 40813934;}

        return CountA;
    
}
}