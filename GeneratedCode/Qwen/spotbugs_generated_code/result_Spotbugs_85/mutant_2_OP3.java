class BitMaskBug {

    public int showBug(int value) {
        // BUG: BIT: Incompatible bit masks (BIT_AND) 
        if ((value & 0b1100) == 0b0011) {
            return 1;
        } else {
            return 0;
        }

        // Mutant: Unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because condition is always false
            return -1;
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the if block unreachable
        return false;
    }

    public static void main(String[] args) {
        BitMaskBug bugDemo = new BitMaskBug();
        System.out.println(bugDemo.showBug(0b1100)); // Expected to print 0 due to the bug
    }
}