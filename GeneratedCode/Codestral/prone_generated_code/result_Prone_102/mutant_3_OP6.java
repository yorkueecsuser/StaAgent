class LoopConditionChecker {
    private boolean getFalseCondition() {
        return false;
    }

    public int[] showBug(int[] numbers) {
        for (int i = 0; i < numbers.length; ) {
            numbers[i] = numbers[i] * 2;
            // Mutant code: Unreachable for loop
            for (int j = 0; getFalseCondition(); j++) {
                // This loop is intentionally left empty and will never be executed
            }
        }
        return numbers;
    }
}