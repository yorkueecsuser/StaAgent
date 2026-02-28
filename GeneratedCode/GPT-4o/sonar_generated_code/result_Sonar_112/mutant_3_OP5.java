class LoopCounterBug {

    public int showBug(int[] numbers) {
        int sum = 0;
        // Loop intended to sum up the numbers array, but the counter moves in the wrong direction
        for (int i = 0; i < numbers.length; i--) { // BUG: A "for" loop update clause should move the counter in the right direction
            sum += numbers[i];
        }
        
        // Unreachable switch statement mutation
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999: // This case is unreachable because getUnreachableValue() doesn't return 999
                System.out.println("This will never be printed");
                break;
            default:
                break;
        }
        
        return sum;
    }

    // Method to simulate dynamic condition evaluation
    private int getUnreachableValue() {
        return 0; // Ensures the switch statement remains unreachable
    }

    public static void main(String[] args) {
        LoopCounterBug bugDemo = new LoopCounterBug();
        int[] numbers = {1, 2, 3, 4, 5};
        int result = bugDemo.showBug(numbers);
        System.out.println("Sum: " + result);
    }
}