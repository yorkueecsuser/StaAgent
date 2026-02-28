class LoopCounterBug {

    public int showBug(int[] numbers) {
        int sum = 0;
        // Loop intended to sum up the numbers array, but the counter moves in the wrong direction
        for (int i = 0; i < numbers.length; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += numbers[i];
        }

        // Inserting an unreachable if-else statement
        boolean unreachableCondition = isConditionMet(); // Use a method to determine condition
        if (unreachableCondition) { 
            System.out.println("This code is unreachable.");
        } else {
            System.out.println("This code is also unreachable.");
        }

        return sum;
    }

    // Method to ensure the condition is dynamic and runtime determined
    private boolean isConditionMet() {
        return false;
    }

    public static void main(String[] args) {
        LoopCounterBug bugDemo = new LoopCounterBug();
        int[] numbers = {1, 2, 3, 4, 5};
        int result = bugDemo.showBug(numbers);
        System.out.println("Sum: " + result);
    }
}