class BuggyEJB {

    private static int CountA = 0;
    private static boolean unreachableCondition() { return false; }

    public void incrementCount() {
        CountA++;
        while (unreachableCondition()) { // This while loop is unreachable.
            System.out.println("This is an unreachable loop!");
        }
    }

    public int showBug() {
        return CountA;
    }
}