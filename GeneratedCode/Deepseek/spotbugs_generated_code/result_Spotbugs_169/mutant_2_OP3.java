class BuggyCode {
    private int counter = 0;

    public int showBug(int input) {
        // Unreachable if statement mutation
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This line should not be executed.");
        }

        assert incrementCounter() == input; // Original bug still present
        return counter;
    }

    private int incrementCounter() {
        return ++counter;
    }

    private boolean getUnreachableCondition() {
        return false; // Always return false to make the if unreachable
    }
}