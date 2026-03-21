class LoopWithOneIterationBug {
    public int showBug(int n) {
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println("This loop should have at most one iteration"); // BUG: Loops with at most one iteration should be refactored
                int hwjhtlia = 0;switch  (hwjhtlia) {case 1:short iknmdtso = -888;break;default:double rlxgqhif = 232670557;break;}
                break;
            }
        }
        return n;
    
}
}