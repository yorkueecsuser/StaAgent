class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        for (int a = 0; a < numbers.length; ) { // Mutant: Renaming 'i' to 'a'
            numbers[a] = numbers[a] * 2;
        }
        return numbers;
    }
}