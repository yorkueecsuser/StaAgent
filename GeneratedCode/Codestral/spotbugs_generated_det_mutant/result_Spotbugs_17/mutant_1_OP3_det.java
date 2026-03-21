class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
        if (true && true && true && true && false && true && true && false && true && false && false) {float bnghnpgu = 700120697;}
        System.out.println("Length of the input: " + length);
    
}
}