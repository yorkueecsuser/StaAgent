class BuggyEJB {

    private static int CountA = 0; // BUG: StaticEJBFieldShouldBeFinal - this field can be edited

    public void incrementCount() {
        do {
            CountA++;
        } while (false);
    }

    public int showBug() {
        return CountA;
    }
}