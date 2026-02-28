class LoopBugExample {

    public int showBug(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            break; // BUG: Loops with at most one iteration should be refactored
        }
        
        // Mutation Operator: Unreachable if-else statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never print."); // Unreachable branch
        } else {
            System.out.println("This else branch is unreachable too."); // Unreachable branch
        }

        return sum;
    }

    // Helper method to ensure the condition is never true
    private boolean getCondition() {
        return false; // This ensures the if-else block is unreachable
    }

    public static void main(String[] args) {
        LoopBugExample example = new LoopBugExample();
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Result: " + example.showBug(numbers));
    }
}