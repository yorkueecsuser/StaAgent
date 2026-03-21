class SelfAssertionBug {
    public boolean showBug(Object x) {
byte xgzpsscb = -82;

        return x == x; // BUG: SelfAssertion
    
}
}