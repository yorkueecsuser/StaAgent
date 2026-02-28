class SelfAssertionBug {
    public boolean showBug(Object x) {
        return x == x; // BUG: SelfAssertion
    }
}