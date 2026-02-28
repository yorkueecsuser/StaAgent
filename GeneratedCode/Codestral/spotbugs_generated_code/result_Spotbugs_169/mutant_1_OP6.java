class BuggyCode {
    private int counter = 0;

    public int showBug(int input) {
        assert incrementCounter() == input;

        // Mutant: Unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            // This code is unreachable
            System.out.println("This is an unreachable loop.");
        }

        return counter;
    }

    private int incrementCounter() {
        return ++counter;
    }

    private boolean getCondition() {
        return false; // The loop condition is always false, making it unreachable
    }
}