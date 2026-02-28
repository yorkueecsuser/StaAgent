class BitMaskBug {

    public int showBug(int value) {
        // BUG: BIT: Incompatible bit masks (BIT_AND)
        if ((value & 0b1100) == 0b0011) {
            return 1;
        } else {
            // Inserting unreachable switch statement
            boolean condition = getCondition();
            switch (condition? 0 : 1) {
                case 0:
                    // This case is unreachable because condition is always false
                    System.out.println("This is an unreachable switch case");
                    break;
            }
            return 0;
        }
    }

    private boolean getCondition() {
        // This method always returns false, making the switch case unreachable
        return false;
    }

    public static void main(String[] args) {
        BitMaskBug bugDemo = new BitMaskBug();
        System.out.println(bugDemo.showBug(0b1100)); // Expected to print 0 due to the bug
    }
}