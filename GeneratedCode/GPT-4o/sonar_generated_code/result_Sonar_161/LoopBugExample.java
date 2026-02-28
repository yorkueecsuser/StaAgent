class LoopBugExample {

    public int showBug(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            break; // BUG: Loops with at most one iteration should be refactored
        }

        // Inserted mutant: Unreachable while loop
        boolean conditionWhile = getUnreachableCondition();
        while (conditionWhile) {
            // This block will never execute
            System.out.println("This is unreachable.");
        }

        return sum;
    }

    private boolean getUnreachableCondition() {
        return false; // Mutation: This method always returns false
    }

    public static void main(String[] args) {
        LoopBugExample example = new LoopBugExample();
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Result: " + example.showBug(numbers));
    }
}