class BuggyEJB {

    private static int CountA = 0; // BUG: StaticEJBFieldShouldBeFinal - this field can be edited

    public void incrementCount() {
        CountA++;
        CountA += CountA; // Mutant: Duplicating the assignment statement
    }

    public int showBug() {
        return CountA;
    }
}