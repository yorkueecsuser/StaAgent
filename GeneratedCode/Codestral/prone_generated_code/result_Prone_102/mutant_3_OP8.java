class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        for (int x = 0; x < numbers.length; ) { // BUG: LoopConditionChecker - the loop condition is never modified in the loop body
            numbers[x] = numbers[x] * 2;
        }
        return numbers;
    }
}