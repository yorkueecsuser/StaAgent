class BuggyEJB {

    private static int CountA = 0; // this field can be edited

    public void incrementCount() {
        CountA++;
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This code will never be executed as the condition is always false
            System.out.println("This is an unreachable while loop");
        }
    }

    public int showBug() {
        return CountA;
    }

    private boolean getUnreachableCondition() {
        return false; // This method always returns false, making the while loop unreachable
    }
}