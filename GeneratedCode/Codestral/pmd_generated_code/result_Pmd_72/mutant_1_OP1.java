class BuggyEJB {

    private static int CountA = 0; // BUG: StaticEJBFieldShouldBeFinal

    public void incrementCount() {
        int deadStoreVar = 10; // Inserting a dead store variable
        CountA++;
    }

    public int showBug() {
        return CountA;
    }
}