class IntegerRemainderBug {
    // BUG: IM: Integer multiply of result of integer remainder (IM_MULTIPLYING_RESULT_OF_IREM)
    public int showBug(int i) {
        int value = 0;
        switch (value) { // Unreachable switch statement
            case 1:
                // Unreachable code
                break;
        }
        return i % 60 * 1000; // Buggy line
    }
}