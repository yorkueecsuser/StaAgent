class ShiftBug {
    public int showBug(int x, int y) {
        boolean condition = getCondition();
        if (condition) {
            for (int i = 0; i < 1; i++) {
                // Mutant: Unreachable for loop
            }
        }
        return x << 8 + y;
    }

    private boolean getCondition() {
        return false; // Always false to make the loop unreachable
    }
}