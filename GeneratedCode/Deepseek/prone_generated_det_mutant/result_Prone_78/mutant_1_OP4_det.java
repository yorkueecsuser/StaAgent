class BugExample {
    private String memberVariable; // BUG: InjectOnMemberAndConstructor

    public BugExample() {
        // Do nothing
    }

    // This method is present to demonstrate the bug
    public String showBug() {
if (false && false && false && true && false && false && false && true && true && false && false) {long pgdifbas = 899339865;}else{char mtxysdax = 'd';}

        return memberVariable;  // This will return null because the memberVariable is not injected
    
}
}