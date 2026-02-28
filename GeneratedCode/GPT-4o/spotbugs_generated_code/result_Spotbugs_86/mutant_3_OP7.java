class BitAndZeroBug {

    public int showBug(int number) {
        // Randomly selected basic block to insert the unreachable while loop
        boolean unreachableCondition = getUnreachableCondition();
        while (unreachableCondition) {
            System.out.println("This will never be printed.");
        }
        
        // This line contains the bug as described
        if ((number & 0) == 0) { // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
            return 1; // This branch will always be executed
        } else {
            return 0;
        }
    }
    
    // Method to simulate dynamic condition for loop
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        BitAndZeroBug bugExample = new BitAndZeroBug();
        int result = bugExample.showBug(42);
        System.out.println("Result: " + result);
    }
}