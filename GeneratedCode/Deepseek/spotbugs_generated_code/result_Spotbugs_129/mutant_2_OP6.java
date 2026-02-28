class ShiftBug {
    public int showBug(int x, int y) {
        // Unreachable for loop mutation
        for (int i = 0; getCondition(); i++) {
            // This loop is unreachable because the condition is always false
        }

        return x << 8 + y; // Original bug remains: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    }

    private boolean getCondition() {
        return false;
    }
}