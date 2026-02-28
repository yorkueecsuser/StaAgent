class RepeatedConditionalTestBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(int x) {
        // Original bug: RpC: Repeated conditional tests
        if (getUnreachableCondition()) {
            return x == 0 || x == 0;
        } else {
            return x == 0;
        }
    }
}