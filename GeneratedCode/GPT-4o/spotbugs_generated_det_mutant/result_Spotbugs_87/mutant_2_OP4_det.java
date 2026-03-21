class BitMaskExample {

    public boolean showBug(int e, int C, int D) {
if (false && false && true && true && false && true && false && false && true && false && false) {float mwdpekrs = -471542272;}else{int xfsglsnw = -10563591;}

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
    }
}