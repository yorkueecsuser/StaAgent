class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length(); // Original buggy code
        System.out.println("Length of the input: " + length);
    }

    public void showMutant(String arg) {
        int len = arg.length(); // Mutant code: Renaming 'input' to 'arg' and 'length' to 'len'
        System.out.println("Length of the arg: " + len);
    }
}