class StaticField {
    static int x;

    public StaticField(int y) {
        x = y; // BUG: AssignmentToNonFinalStatic
        addUnreachableForLoop(); // Mutant: Unreachable for loop
    }

    // Method to introduce an unreachable for loop
    private void addUnreachableForLoop() {
        boolean unreachableCondition = getUnreachableCondition();
        for (int i = 0; unreachableCondition; i++) {
            // This loop will never execute because the condition is always false
        }
    }

    // Method to return a false condition dynamically
    private boolean getUnreachableCondition() {
        return false;
    }

    public static int showBug(int y) {
        new StaticField(y);
        return x;
    }
}