class BuggyEJB {

    private static int CountA = 0; // BUG: StaticEJBFieldShouldBeFinal - this field can be edited

    public void incrementCount() {
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            // This loop is unreachable and will never execute
        }
        CountA++;
    }

    public int showBug() {
        return CountA;
    }
}