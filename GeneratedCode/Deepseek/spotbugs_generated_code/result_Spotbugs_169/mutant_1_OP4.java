class BuggyCode {
    private int counter = 0;

    public int showBug(int input) {
        assert incrementCounter() == input; // BUG: ASE: Expression in assertion may produce a side effect

        boolean shouldNotRun = getCondition();
        if (shouldNotRun) {
            // Unreachable if-else block
            int unreachableVar = 10;
        } else {
            int anotherUnreachableVar = 20;
        }

        return counter;
    }

    private int incrementCounter() {
        return ++counter;
    }

    private boolean getCondition() {
        return false;
    }
}