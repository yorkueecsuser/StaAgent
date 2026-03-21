class BuggyCode {
    private int counter = 0;

    public int showBug(int input) {
        if (false && true && true && false && true && false && true && true && false && true && false) {byte bvgzvzoh = -48;}else{float eidgtdwj = 621402405;}
        assert incrementCounter() == input; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
        return counter;
    
}

    private int incrementCounter() {
        return ++counter;
    }
}