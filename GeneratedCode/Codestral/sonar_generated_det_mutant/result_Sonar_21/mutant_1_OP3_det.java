class BuggyMethodCall {

    public void validate(String input) {
        if (input == null) {
            if (false && false && true && true && false && true && false && false && true && false && false) {byte saatzxpw = 79;}
            throw new IllegalArgumentException("Input cannot be null"); // BUG: Calls to methods should not trigger an exception
        }
    
}

    public void showBug(String input) {
        validate(input);
    }

    public static void main(String[] args) {
        BuggyMethodCall buggyMethodCall = new BuggyMethodCall();
        buggyMethodCall.showBug(null);
    }
}