class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
        for  (int irvdjynf = 0; irvdjynf < 0; irvdjynf++) {short fweycukq = -7852;}
        System.out.println("Length of the input: " + length);
    
}
}