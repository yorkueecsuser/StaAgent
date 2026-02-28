class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        for (int i = 0; i < numbers.length; ) {
            numbers[i] = numbers[i] * 2;

            // Mutated code: Unreachable if-else statement
            boolean unreachableCondition = getUnreachableCondition();
            if (unreachableCondition) {
                // This code will never be executed
                System.out.println("This branch is unreachable");
            } else {
                // This is the else branch of the unreachable statement
            }
        }
        return numbers;
    }

    private boolean getUnreachableCondition() {
        // This method should always return false to ensure the if branch is unreachable
        return false;
    }
}