class IntegerRemainderBug {
    // BUG: IM: Integer multiply of result of integer remainder (IM_MULTIPLYING_RESULT_OF_IREM)
    public int showBug(int i) {
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            // This block is unreachable
        }
        return i % 60 * 1000; // Buggy line
    }

    private boolean getUnreachableCondition() {
        // This method returns a condition that is always false
        return false;
    }
}