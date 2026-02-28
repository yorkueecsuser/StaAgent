class RepeatedConditionalTestBug {
    public boolean showBug(int x) {
        // BUG: RpC: Repeated conditional tests (RpC_REPEATED_CONDITIONAL_TEST)
        if (getUnreachableCondition()) {
            // Unreachable code block
            System.out.println("This code block is unreachable");
        }
        return x == 0 || x == 0;
    }

    private boolean getUnreachableCondition() {
        // Always return false to make the block unreachable
        return false;
    }
}