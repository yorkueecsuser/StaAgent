class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length();
        System.out.println("Length of the input: " + length);

        // Mutant code
        do {
            length = input.length();
            System.out.println("Mutant length of the input: " + length);
        } while (false);
    }
}