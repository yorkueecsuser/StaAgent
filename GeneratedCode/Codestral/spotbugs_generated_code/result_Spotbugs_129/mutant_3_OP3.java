class ShiftBug {
    public int showBug(int x, int y) {
        int result = x << 8 + y;
        // Mutant: Unreachable if statement
        if (getUnreachableCondition()) {
            throw new RuntimeException("This should not be reached");
        }
        return result;
    }

    private boolean getUnreachableCondition() {
        // The condition is always false, making the if block unreachable
        return false;
    }
}