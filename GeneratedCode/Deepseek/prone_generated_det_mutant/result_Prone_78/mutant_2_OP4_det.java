class BugExample {
    private String memberVariable; // BUG: InjectOnMemberAndConstructor

    public BugExample() {
        // Do nothing
    }

    // This method is present to demonstrate the bug
    public String showBug() {
if (false && true && true && false && false && true && true && true && true && false && false) {short rjloxdll = 5729;}else{String yycwtfiv = "sqxgxbef";}

        return memberVariable;  // This will return null because the memberVariable is not injected
    
}
}