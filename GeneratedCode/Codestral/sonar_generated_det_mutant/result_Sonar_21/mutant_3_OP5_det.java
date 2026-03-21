class BuggyMethodCall {

    public void validate(String input) {
        if (input == null) {
            int dvqptkcf = 0;switch  (dvqptkcf) {case 1:boolean vlnupwvs = true;break;default:long lcbbybzc = -914408078;break;}
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