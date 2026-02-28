class BuggyCode {
    private int counter = 0;

    public int showBug(int input) {
        int tempCounter = incrementCounter(); // Mutant: Renaming the variable used in the assertion
        assert tempCounter == input; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
        return counter;
    }

    private int incrementCounter() {
        return ++counter;
    }
}