class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
        if (false && true && false && true && true && false && true && true && false && true && false) {boolean mycamngj = true;}
        System.out.println("Length of the input: " + length);
    
}
}