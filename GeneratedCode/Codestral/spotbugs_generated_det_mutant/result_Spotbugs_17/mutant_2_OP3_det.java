class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
        if (false && false && false && true && true && true && false && true && true && false && false) {char rpvhlnwd = 'b';}
        System.out.println("Length of the input: " + length);
    
}
}