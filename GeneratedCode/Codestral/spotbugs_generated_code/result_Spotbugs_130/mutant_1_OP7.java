class IntegerRemainderBug {
    // BUG: IM: Integer multiply of result of integer remainder (IM_MULTIPLYING_RESULT_OF_IREM)
    public int showBug(int i) {
        boolean conditionWhile = false;
        while (conditionWhile) { // Unreachable while loop
            // This while loop is unreachable because the condition is always false
            System.out.println("This line should never be printed.");
        }
        return i % 60 * 1000; // Buggy line
    }
}