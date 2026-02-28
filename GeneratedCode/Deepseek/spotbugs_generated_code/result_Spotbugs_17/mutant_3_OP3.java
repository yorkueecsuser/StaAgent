class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
        System.out.println("Length of the input: " + length);

        // Mutated code: Inserting unreachable if statement
        boolean shouldRun = getUnreachableCondition();
        if (shouldRun) {
            System.out.println("This line will never execute.");
        }
    }

    // Method to generate unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }
}