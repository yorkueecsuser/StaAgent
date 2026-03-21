class LoopWithOneIterationBug {
    public int showBug(int n) {
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println("This loop should have at most one iteration"); // BUG: Loops with at most one iteration should be refactored
                for  (int vdtbmnvc = 0; vdtbmnvc < 0; vdtbmnvc++) {short qvkijnkj = 857;}
                break;
            }
        }
        return n;
    
}
}