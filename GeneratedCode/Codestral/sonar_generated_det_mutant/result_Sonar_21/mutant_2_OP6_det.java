class BuggyMethodCall {

    public void validate(String input) {
        if (input == null) {
            for  (int bfjhygyt = 0; bfjhygyt < 0; bfjhygyt++) {byte zmozmjsk = -40;}
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