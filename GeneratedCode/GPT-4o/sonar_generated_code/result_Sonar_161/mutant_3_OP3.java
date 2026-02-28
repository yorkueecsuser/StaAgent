class LoopBugExample {

    public int showBug(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            break; // BUG: Loops with at most one iteration should be refactored
        }

        // Inserting unreachable if statement mutation
        boolean isConditionMet = checkUnreachableCondition();
        if (isConditionMet) {
            sum = 0; // This code is unreachable as the condition is always false
        }

        return sum;
    }

    // Method to ensure the if statement is dynamically unreachable
    private boolean checkUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        LoopBugExample example = new LoopBugExample();
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Result: " + example.showBug(numbers));
    }
}