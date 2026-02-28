class BuggyEJB {

    private static int CountA = 0; // BUG: StaticEJBFieldShouldBeFinal - this field can be edited
    private static int deadStore; // Dead Store mutation - this variable is declared but never used

    public void incrementCount() {
        CountA++;
        deadStore = 5; // The deadStore variable is assigned a value but never used
    }

    public int showBug() {
        return CountA;
    }
}