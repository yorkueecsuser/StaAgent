class LoopCounterBug {

    public int showBug(int[] numbers) {
        int sum = 0;
        // Loop intended to sum up the numbers array, but the counter moves in the wrong direction
        for (int i = 0; i < numbers.length; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += numbers[i];
        }
        
        // Inserting an unreachable for loop
        boolean conditionFor = getCondition(); // Dynamically determined condition
        for (int j = 0; conditionFor; j++) {
            // This loop is unreachable because conditionFor will be false
            System.out.println("This will never be printed.");
        }
        
        return sum;
    }
    
    // Method to determine the condition, which returns false to make the loop unreachable
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