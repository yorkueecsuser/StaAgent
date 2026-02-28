class LoopBugExample {

    public int showBug(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            break; // BUG: Loops with at most one iteration should be refactored
        }

        // Mutation: Unreachable while loop
        boolean loopCondition = getFalseCondition();
        while (loopCondition) {
            // This block is unreachable
            int unreachableVariable = 10;
        }

        return sum;
    }

    // Helper method to ensure loop condition is always false
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        LoopBugExample example = new LoopBugExample();
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Result: " + example.showBug(numbers));
    }
}