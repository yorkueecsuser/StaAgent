class BuggyEJB {

    private static int CountA = 0; // BUG: StaticEJBFieldShouldBeFinal - this field can be edited

    public void incrementCount() {
        CountA++;

        // Mutant: Unreachable switch statement
        boolean condition = false;
        if (condition) {
            int value = getValue();
            switch (value) {
                case 1:
                    // Unreachable code
                    break;
                default:
                    // Default case
            }
        }
    }

    private int getValue() {
        // Implementation of getValue method
        return 0;
    }

    public int showBug() {
        return CountA;
    }
}