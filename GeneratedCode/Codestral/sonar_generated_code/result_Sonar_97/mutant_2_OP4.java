class AbsBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public int showBug(String str) {
        boolean shouldRun = getUnreachableCondition();
        if (shouldRun) {
            // Unreachable branch
            throw new IllegalStateException("This branch should be unreachable");
        } else {
            return Math.abs(str.hashCode());
        }
    }
}