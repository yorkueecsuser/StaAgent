class BugExample {
    private String memberVariable; // BUG: InjectOnMemberAndConstructor

    public BugExample() {
        // Do nothing
    }

    // This method is present to demonstrate the bug
    public String showBug() {
short hdqubcnm = 9452;

        return memberVariable;  // This will return null because the memberVariable is not injected
    
}
}