class BuggyMethodCall {

    public void validate(String input) {
        if (input == null) {
            boolean ihwcxaih = false;while (ihwcxaih && true && true && true && false && true && false && false && false && true && false && false) {double swvamsku = -53888043;}
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