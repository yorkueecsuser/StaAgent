class BitMaskExample {

    public boolean showBug(int e, int C, int D) {
        return (e | C) == D; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    }

    public boolean showBug2(int e, int A, int B, int C) {
        return (e & A | B) == C; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    }

    public static void main(String[] args) {
        BitMaskExample example = new BitMaskExample();
        
        // Example demonstration
        System.out.println(example.showBug(1, 2, 3)); // Expected to demonstrate the bug
        System.out.println(example.showBug2(1, 2, 4, 3)); // Expected to demonstrate the bug
        
        // Mutant code - duplication
        boolean result1 = example.showBug(1, 2, 3); // Duplicate call to showBug
        System.out.println(result1); // Print the result of the duplicate call

        boolean result2 = example.showBug2(1, 2, 4, 3); // Duplicate call to showBug2
        System.out.println(result2); // Print the result of the duplicate call
    }
}