class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
        if (true && false && false && true && false && false && false && true && true && false && false) {byte bjrimreg = 73;}else{boolean fdcauztd = true;}
        System.out.println("Length of the input: " + length);
    
}
}