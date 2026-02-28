class BuggyCode {
    private int counter = 0;

    public int showBug(int input) {
        boolean condition = getCondition(); // added for the unreachable loop
        assert incrementCounter() == input; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
        for (int i = 0; condition; i++) { // unreachable loop is added here
            // this loop will never be executed as the condition is always false
        }
        return counter;
    }

    private int incrementCounter() {
        return ++counter;
    }

    private boolean getCondition() { // added to make the loop unreachable
        return false;
    }
}