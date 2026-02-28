class BuggyEJB {

    private static int CountA = 0;

    public void incrementCount() {
        CountA++;
        boolean condition = getCondition();
        for (int i = 0; condition; i++) { // Unreachable for loop
            System.out.println("This line will never be executed");
        }
    }

    public int showBug() {
        return CountA;
    }

    private boolean getCondition() {
        return false; // This method is used to ensure the loop condition is not a compile-time constant
    }
}