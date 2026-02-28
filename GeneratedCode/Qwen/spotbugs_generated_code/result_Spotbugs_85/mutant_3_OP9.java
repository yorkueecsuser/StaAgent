class BitMaskBug {

    public int showBug(int value) {
        // BUG: BIT: Incompatible bit masks (BIT_AND) 
        if ((value & 0b1100) == 0b0011) {
            return 1;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        BitMaskBug bugDemo = new BitMaskBug();
        
        // Added loop for mutation
        int i = 0;
        while (i < 1) {
            System.out.println("Loop iteration: " + i);
            i++;
        }

        // Mutated loop using Equivalent Loop Replacement
        int j = 0;
        do {
            System.out.println("Mutated loop iteration: " + j);
            j++;
        } while (j < 1);

        System.out.println(bugDemo.showBug(0b1100)); // Expected to print 0 due to the bug
    }
}