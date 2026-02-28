class BitMaskBug {

    public int showBug(int value) {
        // BUG: BIT: Incompatible bit masks (BIT_AND)
        if ((value & 0b1100) == 0b0011) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        BitMaskBug bugDemo = new BitMaskBug();
        System.out.println(bugDemo.showBug(0b1100)); // Expected to print 0 due to the bug

        // Mutated code
        int x = 5;
        int y = 10;
        int z = x + y;
        System.out.println(z); // Added to maintain the structure and avoid unreachable code
    }
}