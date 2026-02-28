class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        int unusedVariable; // This is the added dead store. It is not used in the code.
        for (int i = 0; i < numbers.length; ) {
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    }
}