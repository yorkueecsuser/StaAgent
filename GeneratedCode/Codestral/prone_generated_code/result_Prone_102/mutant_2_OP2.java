class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        for (int i = 0; i < numbers.length; ) {
            numbers[i] = numbers[i] * 2;
            // MUTANT: Duplication of the assignment statement
            i = i;  // This line is a duplicate of the loop condition that has no effect
        }
        return numbers;
    }
}