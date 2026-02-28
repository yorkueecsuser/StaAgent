class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        int deadStoreVariable; // Adding a dead store variable
        for (int i = 0; i < numbers.length; ) {
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    }
}