class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
        System.out.println("Length of the input: " + length);

        // Mutant: Unreachable if statement
        if (isUnreachable()) {
            System.out.println("This line should never be executed.");
        }
    }

    private boolean isUnreachable() {
        return false;
    }
}