class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
        System.out.println("Length of the input: " + length);

        // Mutant: Unreachable if-else statement
        boolean shouldNotRun = getFalseCondition();
        if (shouldNotRun) {
            System.out.println("This line should never be reached.");
        } else {
            System.out.println("This line should also never be reached.");
        }
    }

    // This method returns a false condition to make the if-else statement unreachable
    private boolean getFalseCondition() {
        return false;
    }
}