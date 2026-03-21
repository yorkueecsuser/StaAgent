class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
        int lengthDuplicate = length; // Mutated code added by Duplication operator
        System.out.println("Length of the input: " + length);
        System.out.println("Duplicated length of the input: " + lengthDuplicate);
    }
}