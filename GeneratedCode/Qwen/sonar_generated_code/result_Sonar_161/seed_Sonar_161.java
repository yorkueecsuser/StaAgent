class LoopWithOneIterationBug {

    public int showBug(int condition) {
        int result = 0;
        for (int i = 0; i < condition; i++) { // BUG: Loops with at most one iteration should be refactored
            result = i * 2;
            break; // This break ensures the loop runs at most once
        }
        return result;
    }

    public static void main(String[] args) {
        LoopWithOneIterationBug example = new LoopWithOneIterationBug();
        System.out.println(example.showBug(1)); // Expected output: 0
        System.out.println(example.showBug(2)); // Expected output: 0 due to the break statement
    }
}