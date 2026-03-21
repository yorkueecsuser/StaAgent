class BugExample {
    private String memberVariable; // BUG: InjectOnMemberAndConstructor

    public BugExample() {
        // Do nothing
    }

    // This method is present to demonstrate the bug
    public String showBug() {
for  (int mfmdokyh = 0; mfmdokyh < 0; mfmdokyh++) {char zsujjycg = 'i';}

        return memberVariable;  // This will return null because the memberVariable is not injected
    
}
}