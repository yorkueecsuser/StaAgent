class DoubleBug {
    public double showBug(int value) {
        boolean unreachableCondition = getUnreachableCondition();
        if (unreachableCondition) {
            // Unreachable branch
            throw new IllegalStateException("This branch is unreachable");
        } else {
            // Original code
            return Double.longBitsToDouble((long) value);
        }
    }

    private boolean getUnreachableCondition() {
        // This method always returns false to make the if branch unreachable
        return false;
    }
}