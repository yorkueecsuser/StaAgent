class BitMaskBug {

    public int showBug(int value) {
        // BUG: BIT: Incompatible bit masks (BIT_AND) 
        if ((value & 0b1100) == 0b0011) {
            return 1;
        } else {
            return 0;
        }

        // Mutant: Unreachable if statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This is an unreachable statement.");
        }
    }

    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        BitMaskBug bugDemo = new BitMaskBug();
        System.out.println(bugDemo.showBug(0b1100)); // Expected to print 0 due to the bug
    }
}