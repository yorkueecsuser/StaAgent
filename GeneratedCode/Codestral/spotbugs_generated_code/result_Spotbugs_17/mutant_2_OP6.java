class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
        System.out.println("Length of the input: " + length);

        // Mutant: Unreachable for loop
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // This loop is unreachable because the condition is always false
            System.out.println("This line should never be executed: " + i);
        }
    }

    // Method to return a false condition
    private boolean getCondition() {
        return false;
    }
}