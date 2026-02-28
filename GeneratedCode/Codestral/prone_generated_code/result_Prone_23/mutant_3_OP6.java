class ComparisonOutOfRangeBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public boolean showBug(byte value) {
        for (int i = 0; getUnreachableCondition(); i++) {
            System.out.println("This is an unreachable loop");
        }

        // Original code
        return value == 200;
    }
}