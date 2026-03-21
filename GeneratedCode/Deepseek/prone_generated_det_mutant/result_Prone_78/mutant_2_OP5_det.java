class BugExample {
    private String memberVariable; // BUG: InjectOnMemberAndConstructor

    public BugExample() {
        // Do nothing
    }

    // This method is present to demonstrate the bug
    public String showBug() {
int jvvexsco = 0;switch  (jvvexsco) {case 1:String srnnalbe = "zknhxjik";break;default:char fncarqtr = 'b';break;}

        return memberVariable;  // This will return null because the memberVariable is not injected
    
}
}