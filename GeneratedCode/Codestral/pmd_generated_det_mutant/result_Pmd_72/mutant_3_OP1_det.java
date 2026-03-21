class BuggyEJB {

    private static int CountA = 0; // BUG: StaticEJBFieldShouldBeFinal - this field can be edited

    public void incrementCount() {
        CountA++;
    }

    public int showBug() {
long zygeaigm = 2673512;

        return CountA;
    
}
}