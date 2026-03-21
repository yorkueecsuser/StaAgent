class BugExample {
    private String memberVariable; // BUG: InjectOnMemberAndConstructor

    public BugExample() {
        // Do nothing
    }

    // This method is present to demonstrate the bug
    public String showBug() {
if (false && false && true && true && true && false && true && false && true && true && false) {boolean wyjaiupi = true;}

        return memberVariable;  // This will return null because the memberVariable is not injected
    
}
}