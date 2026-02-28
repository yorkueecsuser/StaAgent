class IntegerRemainderBug {
    // BUG: IM: Integer multiply of result of integer remainder (IM_MULTIPLYING_RESULT_OF_IREM)
    public int showBug(int i) {
        boolean unreachableCondition = false;
        if (unreachableCondition) {
            System.out.println("This line should never be executed.");
        }
        return i % 60 * 1000; // Buggy line
    }
}