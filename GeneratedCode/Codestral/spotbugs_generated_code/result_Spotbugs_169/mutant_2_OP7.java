class BuggyCode {
    private int counter = 0;

    public int showBug(int input) {
        boolean unreachableCondition = false;
        while(unreachableCondition) {
            int temp = incrementCounter(); // Unreachable while loop
        }
        assert incrementCounter() == input; // Original bug still exists
        return counter;
    }

    private int incrementCounter() {
        return ++counter;
    }

    private boolean getCondition() {
        return false;
    }
}