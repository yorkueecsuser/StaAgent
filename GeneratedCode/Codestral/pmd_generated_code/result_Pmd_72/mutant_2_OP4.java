class BuggyEJB {

    private static int CountA = 0;
    private static boolean unreachableCondition() { return false; }

    public void incrementCount() {
        CountA++;
        if (unreachableCondition()) {
            // Unreachable code
            System.out.println("This code will never execute");
        }
    }

    public int showBug() {
        return CountA;
    }
}