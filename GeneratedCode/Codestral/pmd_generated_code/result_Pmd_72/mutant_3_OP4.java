class BuggyEJB {

    private static int CountA = 0;

    public void incrementCount() {
        if (getUnreachableCondition()) {
            // Adding an unreachable if-else statement
            CountA++;
        } else {
            System.out.println("This section should never be reached");
        }
    }

    public int showBug() {
        return CountA;
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the if condition unreachable
        return false;
    }
}