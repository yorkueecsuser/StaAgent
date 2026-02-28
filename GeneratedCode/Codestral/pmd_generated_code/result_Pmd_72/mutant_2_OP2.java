class BuggyEJB {

    private static int CountA = 0;

    public void incrementCount() {
        CountA++;
        CountA--; // Mutant: Duplicated statement
    }

    public int showBug() {
        return CountA;
    }
}