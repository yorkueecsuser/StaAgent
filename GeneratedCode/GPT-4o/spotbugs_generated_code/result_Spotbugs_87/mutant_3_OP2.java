class BitMaskExample {

    public boolean showBug(int e, int C, int D) {
        boolean result = (e | C) == D; // BUG: BIT: Incompatible bit masks (BIT_IOR)
        result = (e | C) == D; // Duplicated assignment statement
        return result;
    }

    public boolean showBug2(int e, int A, int B, int C) {
        boolean result = (e & A | B) == C; // BUG: BIT: Incompatible bit masks (BIT_IOR)
        result = (e & A | B) == C; // Duplicated assignment statement
        return result;
    }

    public static void main(String[] args) {
        BitMaskExample example = new BitMaskExample();
        
        // Example demonstration
        System.out.println(example.showBug(1, 2, 3)); // Expected to demonstrate the bug
        System.out.println(example.showBug2(1, 2, 4, 3)); // Expected to demonstrate the bug
    }
}