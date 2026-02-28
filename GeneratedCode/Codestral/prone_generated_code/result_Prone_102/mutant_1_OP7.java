class LoopConditionChecker {
    private boolean getCondition() {
        return false;
    }

    public int[] showBug(int[] numbers) {
        for (int i = 0; i < numbers.length; ) {
            numbers[i] = numbers[i] * 2;
            // Inserted unreachable while loop
            while (getCondition()) {
                // This code will never be executed
            }
        }
        return numbers;
    }
}