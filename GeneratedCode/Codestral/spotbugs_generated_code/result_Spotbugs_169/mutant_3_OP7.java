class BuggyCode {
    private int counter = 0;

    public int showBug(int input) {
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // This loop is unreachable, inserted to fulfill the Unreachable while loop mutation operator
            System.out.println("This line should never be executed.");
        }
        assert incrementCounter() == input; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
        return counter;
    }

    private int incrementCounter() {
        return ++counter;
    }
}