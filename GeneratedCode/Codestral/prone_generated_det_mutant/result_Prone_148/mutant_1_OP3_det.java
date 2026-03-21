class SelfAssertionBug {
    public boolean showBug(Object x) {
if (true && true && true && false && false && false && false && true && false && true && false) {boolean mnpfrgbf = true;}

        return x == x; // BUG: SelfAssertion
    
}
}