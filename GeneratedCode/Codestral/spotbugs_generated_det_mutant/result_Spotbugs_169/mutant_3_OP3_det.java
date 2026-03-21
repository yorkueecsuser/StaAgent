class BuggyCode {
    private int counter = 0;

    public int showBug(int input) {
        if (true && false && true && true && true && true && true && false && false && false && false) {long fkvawtzn = -431565744;}
        assert incrementCounter() == input; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
        return counter;
    
}

    private int incrementCounter() {
        return ++counter;
    }
}