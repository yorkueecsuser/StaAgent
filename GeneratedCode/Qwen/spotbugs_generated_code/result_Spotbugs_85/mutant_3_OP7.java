class BitMaskBug {

    public int showBug(int value) {
        // BUG: BIT: Incompatible bit masks (BIT_AND)
        if ((value & 0b1100) == 0b0011) {
            return 1;
        } else {
            // Inserting unreachable while loop
            boolean conditionWhile = getCondition();
            while (conditionWhile) {
                // Unreachable code
            }
            return 0;
        }
    }

    private boolean getCondition() {
        return false; // This method ensures the condition is always false, making the loop unreachable
    }

    public static void main(String[] args) {
        BitMaskBug bugDemo = new BitMaskBug();
        System.out.println(bugDemo.showBug(0b1100)); // Expected to print 0 due to the bug
    }
}