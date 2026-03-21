class BugExample {
    private String memberVariable; // BUG: InjectOnMemberAndConstructor

    public BugExample() {
        // Do nothing
    }

    // This method is present to demonstrate the bug
    public String showBug() {
boolean qdgizosn = false;while (qdgizosn && false && true && true && false && true && true && true && false && true && false && false) {char nvfsvcth = 'y';}

        return memberVariable;  // This will return null because the memberVariable is not injected
    
}
}