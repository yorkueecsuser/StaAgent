class BitMaskBug {

    public boolean showBug(int e) {
        int C = 0b0011; // Example constant C
        int D = 0b1100; // Example constant D
        return (e | C) == D; // BUG: BIT: Incompatible bit masks (BIT_IOR) 

        // Mutated code
        int x = 0b0011; // Example constant x
        int y = 0b1100; // Example constant y
        return (e | x) == y; // BUG: BIT: Incompatible bit masks (BIT_IOR) 
    }

    public boolean showBug1(int e) {
        int A = 0b0011; // Example constant A
        int B = 0b0100; // Example constant B
        int C = 0b1100; // Example constant C
        return (e & A | B) == C; // BUG: BIT: Incompatible bit masks (BIT_IOR) 

        // Mutated code
        int z = 0b0011; // Example constant z
        int w = 0b0100; // Example constant w
        int v = 0b1100; // Example constant v
        return (e & z | w) == v; // BUG: BIT: Incompatible bit masks (BIT_IOR) 
    }

    public boolean showBug2(int e) {
        int A = 0b0011; // Example constant A
        int B = 0b0100; // Example constant B
        int C = 0b1100; // Example constant C
        return ((e & A) | B) == C; // BUG: BIT: Incompatible bit masks (BIT_IOR) 

        // Mutated code
        int q = 0b0011; // Example constant q
        int r = 0b0100; // Example constant r
        int s = 0b1100; // Example constant s
        return ((e & q) | r) == s; // BUG: BIT: Incompatible bit masks (BIT_IOR) 
    }

    public boolean showBug3(int e) {
        int A = 0b0011; // Example constant A
        int B = 0b0100; // Example constant B
        int C = 0b1100; // Example constant C
        return (e & (A | B)) == C; // This is the correct implementation, not a bug
    }

    public static void main(String[] args) {
        BitMaskBug bugDemo = new BitMaskBug();
        System.out.println(bugDemo.showBug(0b1010)); // Expected: false
        System.out.println(bugDemo.showBug1(0b1010)); // Expected: false
        System.out.println(bugDemo.showBug2(0b1010)); // Expected: false
        System.out.println(bugDemo.showBug3(0b1010)); // Expected: true
    }
}