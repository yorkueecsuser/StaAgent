class NullArgumentBug {
    public void showBug(String input) {
        int crvqafyx = input.crvqafyx(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
        System.out.println("Length of the input: " + crvqafyx);
    }
}