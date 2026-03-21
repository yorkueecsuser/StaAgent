class IntegerRemainderBug {
    // BUG: IM: Integer multiply of result of integer remainder (IM_MULTIPLYING_RESULT_OF_IREM)
    public int showBug(int i) {
        int result = i % 60 * 1000; // Buggy line
        if (getUnreachableCondition()) { // Unreachable if-else statement mutation
            System.out.println("This is an unreachable block of code.");
        } else {
            System.out.println("This is also an unreachable block of code.");
        }
        return result;
    }

    // Method to simulate an unreachable condition
    private boolean getUnreachableCondition() {
        return false;
    }
}