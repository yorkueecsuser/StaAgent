class BuggyCode {
    private int counter = 0;

    public int showBug(int input) {
        boolean condition = getCondition();
        while(condition) { // Mutant code: Unreachable while loop
            incrementCounter();
            condition = false;
        }
        assert incrementCounter() == input; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
        return counter;
    }

    private int incrementCounter() {
        return ++counter;
    }

    private boolean getCondition() {
        return false;
    }
}