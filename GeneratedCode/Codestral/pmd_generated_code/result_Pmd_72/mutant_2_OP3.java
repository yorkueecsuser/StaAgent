class BuggyEJB {

    private static int CountA = 0;

    public void incrementCount() {
        CountA++;
    }

    public int showBug() {
        return CountA;
    }

    public void unreachableMethod() {
        if (getUnreachableCondition()) { // This condition is always false
            System.out.println("This line is unreachable");
        }
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}