class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        for (int i = 0; i < numbers.length; ) {
            numbers[i] = numbers[i] * 2;
            // Mutant code: Duplicated assignment statement
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    }
}