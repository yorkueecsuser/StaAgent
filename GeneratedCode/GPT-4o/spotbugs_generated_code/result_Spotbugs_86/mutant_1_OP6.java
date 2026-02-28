class BitAndZeroBug {

    public int showBug(int number) {
        // This line contains the bug as described
        if ((number & 0) == 0) { // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
            // Unreachable for loop inserted here
            boolean conditionFor = getCondition();
            for (int i = 0; conditionFor; i++) {
                // Unreachable code block
                System.out.println("This is unreachable.");
            }
            return 1; // This branch will always be executed
        } else {
            return 0;
        }
    }
    
    // A method to simulate dynamic condition retrieval for the unreachable loop
    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BitAndZeroBug bugExample = new BitAndZeroBug();
        int result = bugExample.showBug(42);
        System.out.println("Result: " + result);
    }
}