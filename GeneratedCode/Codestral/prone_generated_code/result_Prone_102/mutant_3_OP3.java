class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        for (int i = 0; i < numbers.length; ) {
            boolean unreachableCondition = getCondition();
            if (unreachableCondition) {
                // Unreachable block
                System.out.println("This line should never be executed.");
            }
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    }

    // This method should always return false to make the if statement unreachable
    private boolean getCondition() {
        return false;
    }
}