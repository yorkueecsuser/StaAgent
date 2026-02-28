class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        for (int i = 0; i < numbers.length; ) {
            if (isUnreachableCondition()) {
                // Unreachable code
                System.out.println("This line should never execute");
            }
            numbers[i] = numbers[i] * 2;
        }
        return numbers;
    }

    private boolean isUnreachableCondition() {
        return false;
    }
}