class NullArgumentBug {
    public void showBug(String input) {
        int l = input.length(); // Mutant code: Renaming the variable `length` to `l`
        System.out.println("Length of the input: " + l);
    }
}