class BuggyCode {
    private int count = 0;

    public int showBug(int input) {
        assert incrementCount() == input; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
        return count;
    }

    private int incrementCount() {
        return ++count;
    }

    // Mutant code
    private int incrementCountMutant() {
        return ++count;
    }
}