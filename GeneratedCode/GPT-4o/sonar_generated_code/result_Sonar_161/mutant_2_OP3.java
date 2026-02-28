class LoopBugExample {

    public int showBug(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            break; // BUG: Loops with at most one iteration should be refactored
        }
        
        // Mutation: Inserting an unreachable if statement
        boolean condition = getCondition(); // Non-final variable to avoid compile-time constant
        if (condition) {
            System.out.println("This is unreachable code.");
        }

        return sum;
    }
    
    // Helper method to produce a false condition
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        LoopBugExample example = new LoopBugExample();
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Result: " + example.showBug(numbers));
    }
}