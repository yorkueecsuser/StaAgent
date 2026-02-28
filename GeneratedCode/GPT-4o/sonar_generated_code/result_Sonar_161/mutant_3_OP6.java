class LoopBugExample {

    public int showBug(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            break; // BUG: Loops with at most one iteration should be refactored
        }
        
        // Unreachable for loop mutation
        boolean conditionFor = getCondition();
        for (int j = 0; conditionFor; j++) {
            // Unreachable code
            System.out.println("This is unreachable");
        }

        return sum;
    }

    // Helper method to satisfy the condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        LoopBugExample example = new LoopBugExample();
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Result: " + example.showBug(numbers));
    }
}