class IntegerRemainderBug {
    // BUG: IM: Integer multiply of result of integer remainder (IM_MULTIPLYING_RESULT_OF_IREM)
    public int showBug(int i) {
        for (int j = 0; getFalseCondition(); j++) {
            // Unreachable loop
        }
        return i % 60 * 1000; // Buggy line
    }

    private boolean getFalseCondition() {
        return false;
    }
}