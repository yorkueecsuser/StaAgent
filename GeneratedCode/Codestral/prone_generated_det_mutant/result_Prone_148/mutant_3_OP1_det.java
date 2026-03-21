class SelfAssertionBug {
    public boolean showBug(Object x) {
short msfhoyri = 4768;

        return x == x; // BUG: SelfAssertion
    
}
}