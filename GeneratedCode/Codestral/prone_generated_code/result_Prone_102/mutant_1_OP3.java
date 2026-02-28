class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        for (int i = 0; i < numbers.length; ) {
            numbers[i] = numbers[i] * 2;

            // Mutant: Unreachable if statement
            boolean unreachableCondition = false;
            if (unreachableCondition) {
                // This code is unreachable and will never be executed
                // Adding some code to maintain compile-time success
                int x = 5;
                int y = 10;
                int z = x + y;
            }
        }
        return numbers;
    }
}