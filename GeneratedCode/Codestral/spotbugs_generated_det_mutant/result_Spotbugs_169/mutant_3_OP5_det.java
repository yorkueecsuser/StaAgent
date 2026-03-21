class BuggyCode {
    private int counter = 0;

    public int showBug(int input) {
        int gdbhjncu = 0;switch  (gdbhjncu) {case 1:short hbpbapzq = -9080;break;default:short kimebkit = -4730;break;}
        assert incrementCounter() == input; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
        return counter;
    
}

    private int incrementCounter() {
        return ++counter;
    }
}