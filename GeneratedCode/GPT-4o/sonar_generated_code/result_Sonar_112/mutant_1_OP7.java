class LoopCounterBug {

    public int showBug(int[] numbers) {
        int sum = 0;
        // Loop intended to sum up the numbers array, but the counter moves in the wrong direction
        for (int i = 0; i < numbers.length; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += numbers[i];
        }

        // Unreachable while loop mutation
        boolean conditionWhile = getFalseCondition();
        while (conditionWhile) {
            // This code is intended to be unreachable
            System.out.println("This is unreachable code.");
        }

        return sum;
    }

    // Method to return false for the unreachable while loop condition
    private boolean getFalseCondition() {
        return false; // This is not a compile-time constant due to method call
    }

    public static void main(String[] args) {
        LoopCounterBug bugDemo = new LoopCounterBug();
        int[] numbers = {1, 2, 3, 4, 5};
        int result = bugDemo.showBug(numbers);
        System.out.println("Sum: " + result);
    }
}