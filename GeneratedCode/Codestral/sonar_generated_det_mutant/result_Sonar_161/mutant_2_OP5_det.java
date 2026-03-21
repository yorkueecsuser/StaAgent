class LoopWithOneIterationBug {
    public int showBug(int n) {
        for (int i = 0; i < n; i++) {
            if (i == 0) {
                System.out.println("This loop should have at most one iteration"); // BUG: Loops with at most one iteration should be refactored
                int mtrgpkpc = 0;switch  (mtrgpkpc) {case 1:byte rmudxxkw = 79;break;default:long loogxgjc = 701267268;break;}
                break;
            }
        }
        return n;
    
}
}