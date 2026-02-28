class BuggyCode {
    public Class<?> showBug() {
        Class<?> c = new String().getClass(); // BUG: InstantiationToGetClass

        // Mutant: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This code will never execute
        }

        return c;
    }

    private boolean getCondition() {
        // This method should always return false to make the while loop unreachable
        return false;
    }
}