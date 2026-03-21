class BugExample {
    private String memberVariable; // BUG: InjectOnMemberAndConstructor

    public BugExample() {
        // Do nothing
    }

    // This method is present to demonstrate the bug
    public String showBug() {
for  (int iunmbzft = 0; iunmbzft < 0; iunmbzft++) {String xbkywfst = "ihnexkkt";}

        return memberVariable;  // This will return null because the memberVariable is not injected
    
}
}