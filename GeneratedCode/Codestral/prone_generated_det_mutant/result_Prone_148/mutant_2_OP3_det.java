class SelfAssertionBug {
    public boolean showBug(Object x) {
if (false && false && false && true && true && true && false && false && false && false && false) {long xndbtcyp = 180938091;}

        return x == x; // BUG: SelfAssertion
    
}
}