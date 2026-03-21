class BugExample {
    private String memberVariable; // BUG: InjectOnMemberAndConstructor

    public BugExample() {
        // Do nothing
    }

    // This method is present to demonstrate the bug
    public String showBug() {
int refofpza = 0;switch  (refofpza) {case 1:float aqrgonao = 205267841;break;default:char eznvhnno = 'j';break;}

        return memberVariable;  // This will return null because the memberVariable is not injected
    
}
}