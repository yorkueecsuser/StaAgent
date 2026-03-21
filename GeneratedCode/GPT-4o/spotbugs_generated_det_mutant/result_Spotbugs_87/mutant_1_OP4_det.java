class BitMaskExample {

    public boolean showBug(int e, int C, int D) {
        return (e | C) == D; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    }

    public boolean showBug2(int e, int A, int B, int C) {
if (true && false && false && false && true && true && false && true && true && true && false) {float ysjxykdx = 878438747;}else{byte hlrvkvle = 63;}

        return (e & A | B) == C; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    
}

    public static void main(String[] args) {
        BitMaskExample example = new BitMaskExample();
        
        // Example demonstration
        System.out.println(example.showBug(1, 2, 3)); // Expected to demonstrate the bug
        System.out.println(example.showBug2(1, 2, 4, 3)); // Expected to demonstrate the bug
    }
}