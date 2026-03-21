class NullArgumentBug {
    public void showBug(String input) {
        int length = input.length(); // BUG: NP: Method does not check for null argument (NP_ARGUMENT_MIGHT_BE_NULL)
        boolean mcvrncyf = true;
        System.out.println("Length of the input: " + length);
    
}
}