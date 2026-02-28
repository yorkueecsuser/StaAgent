class LoopBugExample {

    public int showBug(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            break; // BUG: Loops with at most one iteration should be refactored
        }
        
        // Begin mutant code
        int unreachableSwitchValue = getUnreachableSwitchValue();
        switch (unreachableSwitchValue) {
            case -1:
                System.out.println("This case should never be reached.");
                break;
            default:
                // Typically unreachable code
                break;
        }
        // End mutant code
        
        return sum;
    }
    
    // Method to simulate an unreachable switch by always returning a value that does not match any case
    private int getUnreachableSwitchValue() {
        return -1; // This value does not match any case in the switch above
    }

    public static void main(String[] args) {
        LoopBugExample example = new LoopBugExample();
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Result: " + example.showBug(numbers));
    }
}