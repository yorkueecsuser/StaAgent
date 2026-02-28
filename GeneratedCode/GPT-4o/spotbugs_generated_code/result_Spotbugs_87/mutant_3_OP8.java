class BitMaskExample {

    public boolean showBug(int f, int C, int D) {
        return (f | C) == D; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    }

    public boolean showBug2(int g, int A, int B, int C) {
        return (g & A | B) == C; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    }

    public static void main(String[] args) {
        BitMaskExample h = new BitMaskExample();
        
        // Example demonstration
        System.out.println(h.showBug(1, 2, 3)); // Expected to demonstrate the bug
        System.out.println(h.showBug2(1, 2, 4, 3)); // Expected to demonstrate the bug
    }
}