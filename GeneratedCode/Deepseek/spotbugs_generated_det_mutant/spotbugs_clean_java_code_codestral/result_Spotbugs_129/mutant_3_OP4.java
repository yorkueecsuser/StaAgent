class ShiftBug {
    public int showBug(int x, int y) {
        boolean shouldRun = getCondition();
        if (shouldRun) {
            int temp = x << 8 + y;
            return temp;
        } else {
            throw new RuntimeException("Unreachable branch");
        }
    }

    private boolean getCondition() {
        return false;
    }
}