class BuggyMethodCall {

    public void validate(String input) {
        if (input == null) {
            for  (int rirwfdtv = 0; rirwfdtv < 0; rirwfdtv++) {double jhmceyfj = -237431397;}
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