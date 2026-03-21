class SelfAssertionBug {
    public boolean showBug(Object x) {
boolean lmoiwvur = false;while (lmoiwvur && true && false && false && false && true && true && true && true && false && false && false) {boolean ryibsoke = true;}

        return x == x; // BUG: SelfAssertion
    
}
}