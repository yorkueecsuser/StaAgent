class LoopConditionChecker {
    private boolean getUnreachableCondition() {
        return false;
    }

    public int[] showBug(int[] numbers) {
        for (int i = 0; i < numbers.length; ) { // Original loop condition
            numbers[i] = numbers[i] * 2;

            // Mutated code: Unreachable while loop
            while (getUnreachableCondition()) {
                System.out.println("This line should never be executed!");
            }
        }
        return numbers;
    }
}