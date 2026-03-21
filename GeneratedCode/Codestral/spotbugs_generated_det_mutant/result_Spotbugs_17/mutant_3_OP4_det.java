class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
        if (false && true && true && false && false && true && true && false && true && false && false) {float kknwrgzu = 449650671;}else{float gcwgdwhk = 688779785;}
        System.out.println("Length of the input: " + length);
    
}
}