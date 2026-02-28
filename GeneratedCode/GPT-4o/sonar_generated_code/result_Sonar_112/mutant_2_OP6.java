class LoopCounterBug {

    // Method to simulate a condition for the unreachable for loop
    private boolean getConditionForLoop() {
        return false;
    }

    public int showBug(int[] numbers) {
        int sum = 0;
        
        // Unreachable for loop as per mutation operator description
        // The loop condition will be false, making this loop unreachable
        boolean conditionFor = getConditionForLoop();
        for (int j = 0; conditionFor; j++) {
            System.out.println("This is an unreachable loop.");
        }

        // Loop intended to sum up the numbers array, but the counter moves in the wrong direction
        for (int i = 0; i < numbers.length; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        LoopCounterBug bugDemo = new LoopCounterBug();
        int[] numbers = {1, 2, 3, 4, 5};
        int result = bugDemo.showBug(numbers);
        System.out.println("Sum: " + result);
    }
}