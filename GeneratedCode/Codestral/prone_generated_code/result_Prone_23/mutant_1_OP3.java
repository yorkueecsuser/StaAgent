class ComparisonOutOfRangeBug {
    public boolean showBug(byte value) {
        boolean unreachableCondition = this.getUnreachableCondition();
        if (unreachableCondition) {
            throw new RuntimeException("Unreachable code executed");
        }
        return value == 200;
    }

    private boolean getUnreachableCondition() {
        return false;
    }
}