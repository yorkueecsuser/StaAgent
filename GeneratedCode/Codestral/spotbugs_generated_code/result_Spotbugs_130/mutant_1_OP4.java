class IntegerRemainderBug {
    // BUG: IM: Integer multiply of result of integer remainder (IM_MULTIPLYING_RESULT_OF_IREM)
    public int showBug(int i) {
        if (getCondition()) { // non-compile time constant condition
            return i % 60 * 1000; // Buggy line
        } else {
            // Unreachable code
            System.out.println("This line should never execute.");
            return 0;
        }
    }

    private boolean getCondition() {
        return false; // Always false to make the if block unreachable
    }
}