class BuggyCode {
    private int counter = 0;

    public int showBug(int input) {
        assert incrementCounter() == input;
        if (alwaysFalse()) { // MUTATION: Unreachable if statement
            System.out.println("This line is unreachable");
        }
        return counter;
    }

    private int incrementCounter() {
        return ++counter;
    }

    private boolean alwaysFalse() {
        return false;
    }
}