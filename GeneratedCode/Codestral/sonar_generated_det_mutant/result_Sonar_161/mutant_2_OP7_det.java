class LoopWithOneIterationBug {
    public int showBug(int n) {
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println("This loop should have at most one iteration"); // BUG: Loops with at most one iteration should be refactored
                boolean lrvjemuj = false;while (lrvjemuj && false && false && false && false && true && true && false && false && true && true && false) {long zrxhvrlx = -954489256;}
                break;
            }
        }
        return n;
    
}
}