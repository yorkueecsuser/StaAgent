class BitMaskBug {

    public int showBug(int value) {
        // BUG: BIT: Incompatible bit masks (BIT_AND)
        if ((value & 0b1100) == 0b0011) {
            return 1;
        } else {
            return 0;
        }

        // Inserted unreachable if-else branch
        boolean condition = getCondition();
        if (condition) {
            // This block is unreachable because condition is never set to true
            System.out.println("This is an unreachable block");
            return -1;
        } else {
            // This block is also unreachable for the same reason
            System.out.println("This is another unreachable block");
            return -2;
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the if-else block unreachable
        return false;
    }

    public static void main(String[] args) {
        BitMaskBug bugDemo = new BitMaskBug();
        System.out.println(bugDemo.showBug(0b1100)); // Expected to print 0 due to the bug
    }
}