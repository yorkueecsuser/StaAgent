class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        for (int i = 0; i < numbers.length; ) {
            numbers[i] = numbers[i] * 2;
            // Mutant code added
            int temp = i; // Duplication of 'i' assignment statement
            temp = temp * 2; // This line is added to avoid side effect
        }
        return numbers;
    }
}