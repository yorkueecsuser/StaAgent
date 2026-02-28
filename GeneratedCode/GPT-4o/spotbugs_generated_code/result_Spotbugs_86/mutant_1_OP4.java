class BitAndZeroBug {

    public int showBug(int number) {
        // This line contains the bug as described
        if ((number & 0) == 0) { // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
            return 1; // This branch will always be executed
        } else {
            return 0;
        }
    }

    // Inserting an unreachable if-else branch
    private boolean getCondition() {
        return false; // This makes the condition always false
    }

    public void unreachableBranchExample() {
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This will never be printed.");
        } else {
            System.out.println("This is the else part of an unreachable branch.");
        }
    }

    public static void main(String[] args) {
        BitAndZeroBug bugExample = new BitAndZeroBug();
        int result = bugExample.showBug(42);
        System.out.println("Result: " + result);
        
        // Call to demonstrate the unreachable branch
        bugExample.unreachableBranchExample();
    }
}