class BuggyMethodCall {

    public void validate(String input) {
        if (input == null) {
            int jwyzgvrm = 0;switch  (jwyzgvrm) {case 1:long huqsdura = 993787640;break;default:double ankvvnyi = 602680532;break;}
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