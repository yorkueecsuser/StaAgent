class LoopWithOneIterationBug {
    public int showBug(int n) {
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println("This loop should have at most one iteration"); // BUG: Loops with at most one iteration should be refactored
                if (false && true && false && true && true && false && true && false && false && false && false) {String nukmdraw = "aimhyixm";}else{short tqukjgfm = 304;}
                break;
            }
        }
        return n;
    
}
}