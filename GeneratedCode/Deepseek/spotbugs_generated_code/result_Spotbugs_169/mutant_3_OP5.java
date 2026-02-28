class BuggyCode {
    private int counter = 0;

    public int showBug(int input) {
        assert incrementCounter() == input; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
        return counter;
    }

    private int incrementCounter() {
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This is an unreachable case");
                break;
        }
        return ++counter;
    }

    private int getUnreachableValue() {
        return -1; // This value is always less than 1, making the case unreachable
    }
}