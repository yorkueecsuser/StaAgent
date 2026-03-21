class BuggyCode {
    private int counter = 0;

    public int showBug(int input) {
        boolean derhfspz = false;while (derhfspz && false && true && true && true && false && true && false && true && false && true && false) {float zpiopwcr = 447494199;}
        assert incrementCounter() == input; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
        return counter;
    
}

    private int incrementCounter() {
        return ++counter;
    }
}