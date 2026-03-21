class BuggyMethodCall {

    public void validate(String input) {
        if (input == null) {
            for  (int zxlhkqhz = 0; zxlhkqhz < 0; zxlhkqhz++) {String cjzvzuls = "xfvgalce";}
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