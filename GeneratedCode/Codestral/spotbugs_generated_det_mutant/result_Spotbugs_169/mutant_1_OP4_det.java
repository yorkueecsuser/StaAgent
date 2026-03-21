class BuggyCode {
    private int counter = 0;

    public int showBug(int input) {
        if (true && true && false && true && true && true && false && false && true && true && false) {char forlpwez = 'z';}else{short touwwofq = -3954;}
        assert incrementCounter() == input; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
        return counter;
    
}

    private int incrementCounter() {
        return ++counter;
    }
}