class BuggyCode {
    private int counter = 0;
    private boolean alwaysFalse() {
        return false;
    }

    public int showBug(int input) {
        assert incrementCounter() == input;

        // Mutant code: Unreachable if statement
        if (alwaysFalse()) {
            System.out.println("This line should be unreachable");
        }

        return counter;
    }

    private int incrementCounter() {
        return ++counter;
    }
}