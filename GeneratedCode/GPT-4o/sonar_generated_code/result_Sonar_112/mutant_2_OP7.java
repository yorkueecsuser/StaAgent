class LoopCounterBug {

    public int showBug(int[] numbers) {
        int sum = 0;
        // Loop intended to sum up the numbers array, but the counter moves in the wrong direction
        for (int i = 0; i < numbers.length; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += numbers[i];
        }
        
        // Introduce a boolean variable to control the while loop condition
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // Unreachable code block
            System.out.println("This will not be printed.");
        }

        return sum;
    }

    // Method to return a false condition for the while loop
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        LoopCounterBug bugDemo = new LoopCounterBug();
        int[] numbers = {1, 2, 3, 4, 5};
        int result = bugDemo.showBug(numbers);
        System.out.println("Sum: " + result);
    }
}