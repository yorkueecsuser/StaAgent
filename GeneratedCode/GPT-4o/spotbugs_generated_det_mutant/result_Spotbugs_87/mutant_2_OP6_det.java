class BitMaskExample {

    public boolean showBug(int e, int C, int D) {
        return (e | C) == D; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    }

    public boolean showBug2(int e, int A, int B, int C) {
for  (int gxwdzyld = 0; gxwdzyld < 0; gxwdzyld++) {float enrlhlkj = -182242197;}

        return (e & A | B) == C; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    
}

    public static void main(String[] args) {
        BitMaskExample example = new BitMaskExample();
        
        // Example demonstration
        System.out.println(example.showBug(1, 2, 3)); // Expected to demonstrate the bug
        System.out.println(example.showBug2(1, 2, 4, 3)); // Expected to demonstrate the bug
    }
}