class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        boolean unreachableCondition = getUnreachableCondition(); // This method should always return false
        for (int i = 0; unreachableCondition; i++) { // Unreachable for loop
            numbers[i] = numbers[i] * 2;
        }

        for (int i = 0; i < numbers.length; ) { // Original loop condition is still present
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    }

    private boolean getUnreachableCondition() {
        return false; // Always return false to make the loop unreachable
    }
}