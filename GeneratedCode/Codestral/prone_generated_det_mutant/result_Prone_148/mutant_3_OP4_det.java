class SelfAssertionBug {
    public boolean showBug(Object x) {
if (false && true && false && true && true && false && false && true && false && false && false) {byte bddwsdqc = 102;}else{byte urpxiono = -37;}

        return x == x; // BUG: SelfAssertion
    
}
}