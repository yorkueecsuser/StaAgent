class BitMaskBug {

    public int showBug(int value) {
        // BUG: BIT: Incompatible bit masks (BIT_AND)
        if ((value & 0b1100) == 0b0011) {
            return 1;
        } else {
            return 0;
        }

        // Mutated Code: Inserting an unreachable if-else branch
        boolean condition = getUnreachableCondition();
        if (condition) {
            return 2; // This branch is unreachable
        } else {
            return 3; // This branch is also unreachable
        }
    }

    private boolean getUnreachableCondition() {
        return false; // This method always returns false, making the branches unreachable
    }

    public static void main(String[] args) {
        BitMaskBug bugDemo = new BitMaskBug();
        System.out.println(bugDemo.showBug(0b1100)); // Expected to print 0 due to the bug
    }
}