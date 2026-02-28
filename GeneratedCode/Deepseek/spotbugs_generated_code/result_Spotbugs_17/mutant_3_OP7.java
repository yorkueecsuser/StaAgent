class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
        System.out.println("Length of the input: " + length);

        // Mutated code: Unreachable while loop
        boolean shouldRun = getCondition();
        while (shouldRun) {
            // This code block will never execute as the condition is always false
        }
    }

    // A dummy method to return a false condition
    private boolean getCondition() {
        return false;
    }
}