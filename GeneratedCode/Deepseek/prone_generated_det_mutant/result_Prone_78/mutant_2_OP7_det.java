class BugExample {
    private String memberVariable; // BUG: InjectOnMemberAndConstructor

    public BugExample() {
        // Do nothing
    }

    // This method is present to demonstrate the bug
    public String showBug() {
boolean yihcmzgi = false;while (yihcmzgi && true && false && false && true && true && true && false && false && true && true && false) {short udzriggu = 9028;}

        return memberVariable;  // This will return null because the memberVariable is not injected
    
}
}