class BugExample {
    private String memberVariable; // BUG: InjectOnMemberAndConstructor

    public BugExample() {
        // Do nothing
    }

    // This method is present to demonstrate the bug
    public String showBug() {
if (true && true && false && true && false && false && false && true && true && true && false) {byte pcjnkglb = -20;}

        return memberVariable;  // This will return null because the memberVariable is not injected
    
}
}