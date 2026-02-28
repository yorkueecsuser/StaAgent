class LoopConditionChecker {
    public int[] showBug(int[] numbers) {
        for (int i = 0; i < numbers.length; ) {
            numbers[i] = numbers[i] * 2;
            // Mutant code - Unreachable switch statement
            boolean shouldRun = getCondition(); // Assume this method always returns false
            switch (shouldRun? 1 : 0) {
                case 1:
                    // This case is unreachable
                    System.out.println("This line should never execute");
                    break;
                default:
                    // Default case is always executed
                    break;
            }
        }
        return numbers;
    }

    // Method to get the condition
    private boolean getCondition() {
        return false;
    }
}