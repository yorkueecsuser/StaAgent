class LoopCounterBug {

    public int showBug(int[] numbers) {
        int sum = 0;
        
        // Unreachable if branch
        boolean unreachableCondition = getUnreachableCondition(); // Method that always returns false
        if (unreachableCondition) {
            // This block will never run
            System.out.println("This is an unreachable code block.");
        }
        
        // Loop intended to sum up the numbers array, but the counter moves in the wrong direction
        for (int i = 0; i < numbers.length; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += numbers[i];
        }
        return sum;
    }

    private boolean getUnreachableCondition() {
        return false; // Always returns false to make the branch unreachable
    }

    public static void main(String[] args) {
        LoopCounterBug bugDemo = new LoopCounterBug();
        int[] numbers = {1, 2, 3, 4, 5};
        int result = bugDemo.showBug(numbers);
        System.out.println("Sum: " + result);
    }
}