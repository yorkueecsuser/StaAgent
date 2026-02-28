class LoopCounterBug {

    public int showBug(int[] numbers) {
        int sum = 0;
        // Loop intended to sum up the numbers array, but the counter moves in the wrong direction
        for (int i = 0; i < numbers.length; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += numbers[i];
        }
        
        // Unreachable if branch mutation
        boolean condition = getCondition(); // This function ensures we have a dynamic condition
        if (condition) {
            System.out.println("This branch is unreachable.");
        }

        return sum;
    }

    // Method to ensure dynamic evaluation at runtime
    private boolean getCondition() {
        return false; // This makes the if condition always false at runtime
    }

    public static void main(String[] args) {
        LoopCounterBug bugDemo = new LoopCounterBug();
        int[] numbers = {1, 2, 3, 4, 5};
        int result = bugDemo.showBug(numbers);
        System.out.println("Sum: " + result);
    }
}