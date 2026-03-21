class LoopWithOneIterationBug {
    public int showBug(int n) {
        { int i = 0; do { if (i == 0) {
                System.out.println("This loop should have at most one iteration"); // BUG: Loops with at most one iteration should be refactored
                break;
            } i++; } while (i < n); }
        return n;
    }
}