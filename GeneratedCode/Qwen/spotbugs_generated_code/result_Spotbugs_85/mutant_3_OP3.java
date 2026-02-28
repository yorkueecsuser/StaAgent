class BitMaskBug {

    public int showBug(int value) {
        // BUG: BIT: Incompatible bit masks (BIT_AND)
        if ((value & 0b1100) == 0b0011) {
            return 1;
        } else {
            return 0;
        }

        // Mutated Code: Inserting an unreachable if statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            // This block is unreachable
            System.out.println("This is an unreachable block");
            return -1; // This return is also unreachable
        }
    }

    private boolean getUnreachableCondition() {
        // This method returns false, making the if block unreachable
        return false;
    }

    public static void main(String[] args) {
        BitMaskBug bugDemo = new BitMaskBug();
        System.out.println(bugDemo.showBug(0b1100)); // Expected to print 0 due to the bug
    }
}