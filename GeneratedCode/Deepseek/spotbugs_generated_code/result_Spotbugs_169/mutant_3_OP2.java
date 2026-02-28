class BuggyCode {
    private int counter = 0;

    public int showBug(int input) {
        assert incrementCounter() == input; // Original buggy line
        assert incrementCounter() == input; // Buggy line added by duplication
        return counter;
    }

    private int incrementCounter() {
        return ++counter;
    }
}