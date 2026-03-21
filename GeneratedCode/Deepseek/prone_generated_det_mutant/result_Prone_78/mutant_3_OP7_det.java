class BugExample {
    private String memberVariable; // BUG: InjectOnMemberAndConstructor

    public BugExample() {
        // Do nothing
    }

    // This method is present to demonstrate the bug
    public String showBug() {
boolean lgvplbis = false;while (lgvplbis && false && true && true && true && true && true && true && false && false && false && false) {boolean fhnawnzc = true;}

        return memberVariable;  // This will return null because the memberVariable is not injected
    
}
}