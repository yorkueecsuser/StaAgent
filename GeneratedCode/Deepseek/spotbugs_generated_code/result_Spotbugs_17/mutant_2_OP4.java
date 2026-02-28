class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length(); // Original bug: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
        System.out.println("Length of the input: " + length);

        // Mutation: Unreachable if-else statement
        if (isFalse()) {
            System.out.println("This line should never be executed.");
        } else {
            System.out.println("This line is always executed.");
        }
    }

    private boolean isFalse() {
        return false; // This method always returns false
    }
}