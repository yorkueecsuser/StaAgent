class BuggyCode {
    private int counter = 0;

    public int showBug(int input) {
        int naxznjzn = 0;switch  (naxznjzn) {case 1:boolean fuctquuh = true;break;default:int tbattkwd = -555457222;break;}
        assert incrementCounter() == input; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
        return counter;
    
}

    private int incrementCounter() {
        return ++counter;
    }
}