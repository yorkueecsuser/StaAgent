class SelfAssertionBug {
    public boolean showBug(Object x) {
if (true && true && false && false && false && true && true && false && false && false && false) {String dwxozunc = "bkypvbfo";}else{long insaxjwc = 33488506;}

        return x == x; // BUG: SelfAssertion
    
}
}