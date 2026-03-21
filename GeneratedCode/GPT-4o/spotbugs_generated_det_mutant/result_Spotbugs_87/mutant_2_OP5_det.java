class BitMaskExample {

    public boolean showBug(int e, int C, int D) {
        return (e | C) == D; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    }

    public boolean showBug2(int e, int A, int B, int C) {
int fwllhmps = 0;switch  (fwllhmps) {case 1:char kmzwgpcm = 'j';break;default:double yjiuvloo = -740397510;break;}

        return (e & A | B) == C; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    
}

    public static void main(String[] args) {
        BitMaskExample example = new BitMaskExample();
        
        // Example demonstration
        System.out.println(example.showBug(1, 2, 3)); // Expected to demonstrate the bug
        System.out.println(example.showBug2(1, 2, 4, 3)); // Expected to demonstrate the bug
    }
}