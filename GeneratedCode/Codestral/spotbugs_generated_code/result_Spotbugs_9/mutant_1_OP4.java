class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        // Original code
        boolean repeatedTest = x == 0 || x == 0;

        // Mutated code: Unreachable if-else statement
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            System.out.println("This block should never be executed.");
        } else {
            System.out.println("This block should always be executed.");
        }

        return repeatedTest;
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the if-else branch unreachable
        return false;
    }
}