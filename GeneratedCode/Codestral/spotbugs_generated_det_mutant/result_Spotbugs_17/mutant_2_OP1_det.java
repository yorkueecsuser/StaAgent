class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
        short hiizuvkp = 332;
        System.out.println("Length of the input: " + length);
    
}
}