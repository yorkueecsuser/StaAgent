class BugExample {
    private String memberVariable; // BUG: InjectOnMemberAndConstructor

    public BugExample() {
        // Do nothing
    }

    // This method is present to demonstrate the bug
    public String showBug() {
int ygadvbrn = 0;switch  (ygadvbrn) {case 1:short jodpzthb = -1581;break;default:byte pwcjnnqe = -84;break;}

        return memberVariable;  // This will return null because the memberVariable is not injected
    
}
}