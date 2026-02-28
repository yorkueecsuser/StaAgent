class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length();
        System.out.println("Length of the input: " + length);

        // Mutant code: Introducing a do-while loop that does not check for null argument
        int i = 0;
        do {
            System.out.println("Character at index " + i + ": " + input.charAt(i)); // BUG: NP_ARGUMENT_MIGHT_BE_NULL
            i++;
        } while (i < length);
    }
}