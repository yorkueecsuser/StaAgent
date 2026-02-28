class ShiftBug {
    public int showBug(int x, int y) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            // This branch should never run
            int result = x << 8 + y; // Original bug
            return result;
        } else {
            // This branch is the original code
            return x << 8 + y; // Original bug
        }
    }

    private boolean getCondition() {
        // This method returns a false value to make the if branch unreachable
        return false;
    }
}