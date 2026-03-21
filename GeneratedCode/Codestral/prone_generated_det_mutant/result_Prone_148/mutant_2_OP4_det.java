class SelfAssertionBug {
    public boolean showBug(Object x) {
if (false && false && true && true && false && false && true && false && false && false && false) {String cocyhxnl = "kprpisxn";}else{double krnobgie = 657633477;}

        return x == x; // BUG: SelfAssertion
    
}
}