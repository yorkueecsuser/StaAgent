class BuggyCode {
    private int counter = 0;
    private boolean alwaysFalse = false;

    public int showBug(int input) {
        assert incrementCounter() == input; // Original bug remains

        // Mutant code (Unreachable if-else statement)
        if (alwaysFalse) {
            // This block is unreachable because alwaysFalse is always false
            int temp = counter + 10; // Just a placeholder statement
        } else {
            // This block is always executed
            // Placeholder statement to prevent unreachable code error
            int temp = counter;
        }

        return counter;
    }

    private int incrementCounter() {
        return ++counter;
    }
}