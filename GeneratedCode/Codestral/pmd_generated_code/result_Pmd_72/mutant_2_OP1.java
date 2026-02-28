class BuggyEJB {

    private static int CountA = 0;
    private static int deadStoreVariable; // Mutant code added for Dead Store mutation

    public void incrementCount() {
        CountA++;
        deadStoreVariable = 10; // Assigning a value to the dead store variable
    }

    public int showBug() {
        return CountA;
    }
}