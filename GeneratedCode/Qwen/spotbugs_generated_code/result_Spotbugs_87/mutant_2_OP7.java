class BitMaskBug {

    public boolean showBug(int e) {
        int C = 0b0011; // Example constant C
        int D = 0b1100; // Example constant D
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
        }
        return (e | C) == D; // BUG: BIT: Incompatible bit masks (BIT_IOR) 
    }

    public boolean showBug1(int e) {
        int A = 0b0011; // Example constant A
        int B = 0b0100; // Example constant B
        int C = 0b1100; // Example constant C
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
        }
        return (e & A | B) == C; // BUG: BIT: Incompatible bit masks (BIT_IOR) 
    }

    public boolean showBug2(int e) {
        int A = 0b0011; // Example constant A
        int B = 0b0100; // Example constant B
        int C = 0b1100; // Example constant C
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
        }
        return ((e & A) | B) == C; // BUG: BIT: Incompatible bit masks (BIT_IOR) 
    }

    public boolean showBug3(int e) {
        int A = 0b0011; // Example constant A
        int B = 0b0100; // Example constant B
        int C = 0b1100; // Example constant C
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
        }
        return (e & (A | B)) == C; // This is the correct implementation, not a bug
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        BitMaskBug bugDemo = new BitMaskBug();
        System.out.println(bugDemo.showBug(0b1010)); // Expected: false
        System.out.println(bugDemo.showBug1(0b1010)); // Expected: false
        System.out.println(bugDemo.showBug2(0b1010)); // Expected: false
        System.out.println(bugDemo.showBug3(0b1010)); // Expected: true
    }
}