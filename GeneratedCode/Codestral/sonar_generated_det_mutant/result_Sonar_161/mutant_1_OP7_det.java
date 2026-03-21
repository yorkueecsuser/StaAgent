class LoopWithOneIterationBug {
    public int showBug(int n) {
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println("This loop should have at most one iteration"); // BUG: Loops with at most one iteration should be refactored
                boolean pzilifha = false;while (pzilifha && false && true && false && true && true && true && false && true && true && true && false) {int dzlanint = -993633051;}
                break;
            }
        }
        return n;
    
}
}