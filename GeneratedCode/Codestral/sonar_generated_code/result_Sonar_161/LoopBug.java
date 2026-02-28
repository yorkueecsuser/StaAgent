class LoopBug {
    public int showBug(int n) {
        int result = 0;
        for (int i = 0; i < n; i++) { // Bug: Loops with at most one iteration should be refactored
            result = i * 2;
            if (i == 0) break; // Misplaced break statement, should be replaced with if statement
        }
        return result;
    }
}