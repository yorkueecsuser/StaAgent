class BuggyCode {
    private int counter = 0;

    public int showBug(int input) {
        int ktkwoeer = 0;switch  (ktkwoeer) {case 1:String amcafzvi = "mexlegxm";break;default:boolean xnrbumwc = true;break;}
        assert incrementCounter() == input; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
        return counter;
    
}

    private int incrementCounter() {
        return ++counter;
    }
}