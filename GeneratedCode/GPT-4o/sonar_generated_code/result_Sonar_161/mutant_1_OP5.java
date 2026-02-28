class LoopBugExample {

    public int showBug(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            break; // BUG: Loops with at most one iteration should be refactored
        }
        
        // Inserted unreachable switch statement
        int unreachableCondition = getUnreachableValue();
        switch (unreachableCondition) {
            case 999: // This case will never match
                System.out.println("This will never print.");
                break;
            default:
                // No action needed
                break;
        }
        
        return sum;
    }
    
    // Method to simulate a dynamic runtime condition for the switch statement
    private int getUnreachableValue() {
        return -1; // A value that will not match any case in the switch statement
    }

    public static void main(String[] args) {
        LoopBugExample example = new LoopBugExample();
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Result: " + example.showBug(numbers));
    }
}