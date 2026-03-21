class BuggyCode {
    private int counter = 0;

    public int showBug(int input) {
        boolean ajxqapvz = false;while (ajxqapvz && true && true && false && false && true && true && true && true && false && false && false) {boolean ibxwjkxf = true;}
        assert incrementCounter() == input; // BUG: ASE: Expression in assertion may produce a side effect (ASE_ASSERTION_WITH_SIDE_EFFECT)
        return counter;
    
}

    private int incrementCounter() {
        return ++counter;
    }
}