class LoopCounterBug {

    public int showBug(int[] numbers) {
        int sum = 0;
        // Loop intended to sum up the numbers array, but the counter moves in the wrong direction
        for (int i = 0; i < numbers.length; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += numbers[i];
        }

        // Inserting an unreachable while loop as per the mutation operator
        boolean conditionWhile = getCondition(); // Ensure dynamic evaluation
        while (conditionWhile) {
            System.out.println("This is an unreachable while loop.");
        }

        return sum;
    }

    // Method to simulate a condition that is always false but not constant at compile time
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        LoopCounterBug bugDemo = new LoopCounterBug();
        int[] numbers = {1, 2, 3, 4, 5};
        int result = bugDemo.showBug(numbers);
        System.out.println("Sum: " + result);
    }
}