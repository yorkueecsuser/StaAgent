class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
        if (true && false && false && true && false && true && true && false && true && true && false) {float yfkacock = 853898269;}else{int qfhyeyhn = -147448070;}
        System.out.println("Length of the input: " + length);
    
}
}