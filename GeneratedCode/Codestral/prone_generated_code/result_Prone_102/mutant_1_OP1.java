class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        int unusedVar; // Dead store added by mutation operator
        for (int i = 0; i < numbers.length; ) { // BUG: LoopConditionChecker - the loop condition is never modified in the loop body
            numbers[i] = numbers[i] * 2;
            unusedVar = 5; // Assigning a value to the unused variable to avoid compiler errors
        }
        return numbers;
    }
}