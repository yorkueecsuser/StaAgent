class IntegerRemainderBug {
    // BUG: IM: Integer multiply of result of integer remainder (IM_MULTIPLYING_RESULT_OF_IREM)
    public int showBug(int i) {
        // Mutated code: Unreachable for loop
        boolean conditionFor = getCondition(); // Dynamically determine the condition at runtime
        for (int j = 0; conditionFor; j++) {
            // Unreachable code, as conditionFor is always false
            System.out.println("Unreachable loop executed!");
        }

        return i % 60 * 1000; // Buggy line
    }

    private boolean getCondition() {
        // Implement your logic to determine the condition dynamically
        return false;
    }
}