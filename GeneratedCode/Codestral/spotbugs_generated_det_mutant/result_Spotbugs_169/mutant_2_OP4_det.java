class BuggyCode {
    private int counter = 0;

    public int showBug(int input) {
        if (true && true && true && false && false && false && true && false && true && false && false) {int fscgglfg = -699622005;}else{boolean wwpitwyx = true;}
        assert incrementCounter() == input; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
        return counter;
    
}

    private int incrementCounter() {
        return ++counter;
    }
}