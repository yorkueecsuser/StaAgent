class BitMaskBug {

    public boolean showBug(int e) {
        int C = 0b0011; // Example constant C
        int D = 0b1100; // Example constant D
        return (e | C) == D; // BUG: BIT: Incompatible bit masks (BIT_IOR) 
    }

    public boolean showBug1(int e) {
        int A = 0b0011; // Example constant A
        int B = 0b0100; // Example constant B
        int C = 0b1100; // Example constant C
        return (e & A | B) == C; // BUG: BIT: Incompatible bit masks (BIT_IOR) 
    }

    public boolean showBug2(int e) {
        int A = 0b0011; // Example constant A
        int B = 0b0100; // Example constant B
        int C = 0b1100; // Example constant C
        return ((e & A) | B) == C; // BUG: BIT: Incompatible bit masks (BIT_IOR) 
    }

    public boolean showBug3(int e) {
        int A = 0b0011; // Example constant A
        int B = 0b0100; // Example constant B
        int C = 0b1100; // Example constant C
        return (e & (A | B)) == C; // This is the correct implementation, not a bug
    }

    // Mutant code added to maintain the original bug
    public boolean showBugMutant1(int e) {
        int C = 0b0011; // Example constant C
        int D = 0b1100; // Example constant D
        int result = 0;
        do {
            result = (e | C);
        } while (false);
        return result == D; // BUG: BIT: Incompatible bit masks (BIT_IOR) 
    }

    public boolean showBugMutant2(int e) {
        int A = 0b0011; // Example constant A
        int B = 0b0100; // Example constant B
        int C = 0b1100; // Example constant C
        int result = 0;
        do {
            result = (e & A | B);
        } while (false);
        return result == C; // BUG: BIT: Incompatible bit masks (BIT_IOR) 
    }

    public boolean showBugMutant3(int e) {
        int A = 0b0011; // Example constant A
        int B = 0b0100; // Example constant B
        int C = 0b1100; // Example constant C
        int result = 0;
        do {
            result = ((e & A) | B);
        } while (false);
        return result == C; // BUG: BIT: Incompatible bit masks (BIT_IOR) 
    }

    public static void main(String[] args) {
        BitMaskBug bugDemo = new BitMaskBug();
        System.out.println(bugDemo.showBug(0b1010)); // Expected: false
        System.out.println(bugDemo.showBug1(0b1010)); // Expected: false
        System.out.println(bugDemo.showBug2(0b1010)); // Expected: false
        System.out.println(bugDemo.showBug3(0b1010)); // Expected: true
        System.out.println(bugDemo.showBugMutant1(0b1010)); // Expected: false
        System.out.println(bugDemo.showBugMutant2(0b1010)); // Expected: false
        System.out.println(bugDemo.showBugMutant3(0b1010)); // Expected: false
    }
}