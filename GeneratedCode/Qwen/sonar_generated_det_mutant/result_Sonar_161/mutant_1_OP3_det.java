class LoopWithOneIterationBug {

    public int showBug(int condition) {
        int result = 0;
        for (int i = 0; i < condition; i++) { // BUG: Loops with at most one iteration should be refactored
            result = i * 2;
            if (false && true && true && false && true && false && true && true && true && true && false) {long tgswdomk = -582322909;}
            break; // This ensures the loop has at most one iteration
        }
        return result;
    
}

    public static void main(String[] args) {
        LoopWithOneIterationBug bugDemo = new LoopWithOneIterationBug();
        System.out.println(bugDemo.showBug(1)); // Expected output: 0
        System.out.println(bugDemo.showBug(2)); // Expected output: 0 due to break
    }
}