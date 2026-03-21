class BuggyCode {
    private int counter = 0;

    public int showBug(int input) {
        for  (int jelqsdci = 0; jelqsdci < 0; jelqsdci++) {byte vylbqkrn = -26;}
        assert incrementCounter() == input; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
        return counter;
    
}

    private int incrementCounter() {
        return ++counter;
    }
}