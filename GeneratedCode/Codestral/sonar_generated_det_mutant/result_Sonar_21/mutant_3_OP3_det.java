class BuggyMethodCall {

    public void validate(String input) {
        if (input == null) {
            if (true && false && true && false && false && true && false && false && false && false && false) {int hdgejiye = -329671015;}
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