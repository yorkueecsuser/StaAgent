class LoopWithOneIterationBug {
    public int showBug(int n) {
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println("This loop should have at most one iteration"); // BUG: Loops with at most one iteration should be refactored
                for  (int zxjlxixr = 0; zxjlxixr < 0; zxjlxixr++) {String qgajyeuq = "xxqemwtf";}
                break;
            }
        }
        return n;
    
}
}