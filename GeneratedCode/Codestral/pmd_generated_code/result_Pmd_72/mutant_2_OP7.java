class BuggyEJB {

    private static int CountA = 0;

    public void incrementCount() {
        CountA++;
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code is unreachable
            System.out.println("Unreachable Code");
        }
    }

    private boolean getCondition() {
        return false;
    }

    public int showBug() {
        return CountA;
    }
}