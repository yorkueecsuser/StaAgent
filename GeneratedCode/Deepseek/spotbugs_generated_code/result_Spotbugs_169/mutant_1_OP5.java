class BuggyCode {
    private int counter = 0;

    public int showBug(int input) {
        assert incrementCounter() == input; // Original bug: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)

        // Mutant Code Start
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This line should never be executed");
                break;
            default:
                break;
        }
        // Mutant Code End

        return counter;
    }

    private int incrementCounter() {
        return ++counter;
    }

    private int getUnreachableValue() {
        return -1; // Always returns a value that is not 1, making the switch case unreachable
    }
}