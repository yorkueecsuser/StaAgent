class BuggyCode {
    private int counter = 0;

    public int showBug(int input) {
        boolean unreachableCondition = false;
        for (int i = 0; unreachableCondition; i++) {
            // This loop is unreachable because the condition is always false.
        }
        assert incrementCounter() == input; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
        return counter;
    }

    private int incrementCounter() {
        return ++counter;
    }
}