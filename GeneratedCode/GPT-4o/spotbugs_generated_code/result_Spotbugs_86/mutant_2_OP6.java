class BitAndZeroBug {

    public int showBug(int number) {
        // This line contains the bug as described
        if ((number & 0) == 0) { // BUG: BIT: Check to see if ((…) & 0) == 0 (BIT_AND_ZZ)
            // Inserting an unreachable for loop
            boolean conditionFor = getConditionFor();
            for (int i = 0; conditionFor; i++) {
                System.out.println("This is unreachable code.");
            }
            return 1; // This branch will always be executed
        } else {
            return 0;
        }
    }

    private boolean getConditionFor() {
        return false; // This makes the for loop unreachable
    }

    public static void main(String[] args) {
        BitAndZeroBug bugExample = new BitAndZeroBug();
        int result = bugExample.showBug(42);
        System.out.println("Result: " + result);
    }
}