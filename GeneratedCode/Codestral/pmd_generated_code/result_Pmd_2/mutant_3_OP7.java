class StaticField {
    static int x;

    public StaticField(int y) {
        x = y; // BUG: AssignmentToNonFinalStatic

        // Added mutant code
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            System.out.println("Unreachable code");
            break;
        }
    }

    // Method to simulate the condition of the while loop
    private boolean getCondition() {
        return false; // Always return false to make the loop unreachable
    }

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}