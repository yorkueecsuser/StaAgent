class BitMaskExample {

    public boolean showBug(int e, int C, int D) {
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 999:
                System.out.println("This case is unreachable");
                break;
            default:
                // Do nothing
                break;
        }
        return (e | C) == D; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    }

    public boolean showBug2(int e, int A, int B, int C) {
        int unreachableValue2 = getUnreachableValue();
        switch (unreachableValue2) {
            case 888:
                System.out.println("Another unreachable case");
                break;
            default:
                // Do nothing
                break;
        }
        return (e & A | B) == C; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    }

    public int getUnreachableValue() {
        return -1; // Always returns a value not covered in the switch cases
    }

    public static void main(String[] args) {
        BitMaskExample example = new BitMaskExample();
        
        // Example demonstration
        System.out.println(example.showBug(1, 2, 3)); // Expected to demonstrate the bug
        System.out.println(example.showBug2(1, 2, 4, 3)); // Expected to demonstrate the bug
    }
}