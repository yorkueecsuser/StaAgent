class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        for (int i = 0; i < numbers.length; ) { // Original loop
            numbers[i] = numbers[i] * 2;
        }

        // Mutated loop with variable renaming
        for (int x = 0; x < numbers.length; ) {
            numbers[x] = numbers[x] * 2;
        }
        return numbers;
    }
}