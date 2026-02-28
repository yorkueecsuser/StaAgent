class BuggyCode {
    private int counter = 0;
    private boolean getCondition() {
        return false;
    }

    public int showBug(int input) {
        assert incrementCounter() == input;

        if (getCondition()) {    // Inserted unreachable if-else statement
            System.out.println("This code will never be executed");
        } else {
            // This else branch is unreachable as the condition is always false
        }

        return counter;
    }

    private int incrementCounter() {
        return ++counter;
    }
}