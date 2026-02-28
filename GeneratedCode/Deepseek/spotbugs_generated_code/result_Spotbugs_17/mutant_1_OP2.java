class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length();
        int duplicateLength = length; // Mutant: Duplicates the assignment statement
        System.out.println("Length of the input: " + length);
        System.out.println("Duplicate length of the input: " + duplicateLength); // Prints the duplicate length
        // Bug: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL) is still present
    }
}