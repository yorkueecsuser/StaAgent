class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length(); // Original bug: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
        int lengthDuplicate = input.length(); // Mutant code: Duplicated assignment statement
        System.out.println("Length of the input: " + length);
        System.out.println("Duplicated length of the input: " + lengthDuplicate); // Print out the duplicated length
    }
}