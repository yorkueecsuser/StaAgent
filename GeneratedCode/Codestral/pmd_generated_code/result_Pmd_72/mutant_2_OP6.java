class BuggyEJB {

    private static int CountA = 0;

    public void incrementCount() {
        CountA++;

        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) {
            // Unreachable code - this loop will never execute
        }
    }

    public int showBug() {
        return CountA;
    }
}