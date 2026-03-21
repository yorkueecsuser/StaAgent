class SelfAssertionBug {
    public boolean showBug(Object x) {
if (false && true && false && true && false && true && true && true && true && true && false) {float cydoobhj = 361206412;}

        return x == x; // BUG: SelfAssertion
    
}
}