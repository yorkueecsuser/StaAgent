class ShiftBug {
    public int showBug(int x, int y) {
        if (getCondition()) {  // A unreachable if branch is inserted
            int z = x << 8 + y; // The bug is still present
            return z;
        }
        return x << 8 + y;  // BUG: BSHIFT: Possible bad parsing of shift operation (BSHIFT_WRONG_ADD_PRIORITY)
    }

    public boolean getCondition() {
        // Implement a method that returns a constant false
        return false;
    }
}