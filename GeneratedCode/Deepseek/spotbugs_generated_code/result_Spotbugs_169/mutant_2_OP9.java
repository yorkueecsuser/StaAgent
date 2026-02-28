class BuggyCode {
    private int counter = 0;

    public int showBug(int input) {
        assert incrementCounter() == input; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
        // Introduce equivalent loop mutant
        do {
            // Intentionally left empty, since the requirement is to maintain the original code and bug.
        } while (false);
        return counter;
    }

    private int incrementCounter() {
        return ++counter;
    }
}