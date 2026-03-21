class BuggyCode {
    private int counter = 0;

    public int showBug(int input) {
        assert incrementCounter() == input; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)

        // Mutation Operator: Unreachable switch statement
        int value = getUnusedValue();
        switch(value) {
            case 1:
                System.out.println("Unreachable code");
                break;
        }

        return counter;
    }

    private int incrementCounter() {
        return ++counter;
    }

    private int getUnusedValue() {
        // This method will always return a value that is not 1
        // Making the switch statement unreachable
        return 2;
    }
}