class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        { int i = 0; do { // BUG: LoopConditionChecker - the loop condition is never modified in the loop body
            numbers[i] = numbers[i] * 2; } while (i < numbers.length); }
        return numbers;
    }
}