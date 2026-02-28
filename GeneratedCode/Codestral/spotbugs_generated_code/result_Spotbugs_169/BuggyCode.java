class BuggyCode {
    private int counter = 0;

    public int showBug(int input) {
        assert incrementCounter() == input; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
        return counter;
    }

    private int incrementCounter() {
        int result;
        do {
            result = ++counter;
        } while (false);
        return result;
    }
}