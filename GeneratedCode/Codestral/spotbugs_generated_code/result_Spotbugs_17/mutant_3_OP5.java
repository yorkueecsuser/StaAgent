class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
        System.out.println("Length of the input: " + length);

        // Mutant code: Unreachable switch statement
        boolean shouldRun = false;
        int value = 0;
        if (shouldRun) {
            value = 1;
        }
        switch (value) {
            case 1:
                System.out.println("This will never be printed due to the unreachable switch statement.");
                break;
        }
    }
}