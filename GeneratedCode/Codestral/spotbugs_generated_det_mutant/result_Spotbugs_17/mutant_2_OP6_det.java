class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
        for  (int ffpsxrsa = 0; ffpsxrsa < 0; ffpsxrsa++) {float tnzmpuin = -850947115;}
        System.out.println("Length of the input: " + length);
    
}
}