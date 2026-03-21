class BugExample {
    private String memberVariable; // BUG: InjectOnMemberAndConstructor

    public BugExample() {
        // Do nothing
    }

    // This method is present to demonstrate the bug
    public String showBug() {
if (true && false && false && false && true && true && false && false && true && false && false) {boolean koegfgxy = true;}else{String mhxexllw = "hzlruspa";}

        return memberVariable;  // This will return null because the memberVariable is not injected
    
}
}