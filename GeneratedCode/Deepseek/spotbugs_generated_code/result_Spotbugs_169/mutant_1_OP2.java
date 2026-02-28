class BuggyCode {
    private int counter = 0;

    public int showBug(int input) {
        assert incrementCounter() == input; // Original Bug: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
        int localCounter = counter; // Mutant Code: Duplicate the assignment statement
        assert localCounter == input; // This assertion statement will not produce side effect as it doesn't modify the counter variable
        return counter;
    }

    private int incrementCounter() {
        return ++counter;
    }
}