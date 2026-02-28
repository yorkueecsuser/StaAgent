class LoopConditionChecker {
    public boolean getFalseCondition() {
        return false; // This method always returns false
    }

    public int[] showBug(int[] numbers) {
        for (int i = 0; i < numbers.length; ) { // BUG: LoopConditionChecker - the loop condition is never modified in the loop body
            numbers[i] = numbers[i] * 2;
            // Mutant: Unreachable while loop
            boolean conditionWhile = getFalseCondition();
            while (conditionWhile) {
                // This code is unreachable because conditionWhile is always false
                System.out.println("This is an unreachable statement");
            }
        }
        return numbers;
    }
}