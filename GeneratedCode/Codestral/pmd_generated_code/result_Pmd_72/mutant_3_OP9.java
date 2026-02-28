class BuggyEJB {

    // Bug: StaticEJBFieldShouldBeFinal - this field can be edited
    // Mutation applied: Changed the static field to be non-final
    private static int CountA = 0;

    public void incrementCount() {
        CountA++;
    }

    public int showBug() {
        return CountA;
    }
}