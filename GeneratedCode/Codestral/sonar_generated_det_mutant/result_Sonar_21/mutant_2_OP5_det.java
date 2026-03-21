class BuggyMethodCall {

    public void validate(String input) {
        if (input == null) {
            int zbwvzffm = 0;switch  (zbwvzffm) {case 1:short scljiorx = 2885;break;default:String giwssclc = "qdghmdsi";break;}
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