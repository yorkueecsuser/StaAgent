class BitMaskExample {

    public boolean showBug(int e, int C, int D) {
        // Unreachable switch statement
        int dummyValue = getDummyValue();
        switch (dummyValue) {
            case 999:
                System.out.println("This is unreachable");
                break;
        }
        
        return (e | C) == D; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    }

    public boolean showBug2(int e, int A, int B, int C) {
        // Unreachable switch statement
        int anotherDummyValue = getAnotherDummyValue();
        switch (anotherDummyValue) {
            case 888:
                System.out.println("This is also unreachable");
                break;
        }
        
        return (e & A | B) == C; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    }

    private int getDummyValue() {
        return 0; // This ensures the switch case is never reached
    }

    private int getAnotherDummyValue() {
        return 0; // This ensures the switch case is never reached
    }

    public static void main(String[] args) {
        BitMaskExample example = new BitMaskExample();
        
        // Example demonstration
        System.out.println(example.showBug(1, 2, 3)); // Expected to demonstrate the bug
        System.out.println(example.showBug2(1, 2, 4, 3)); // Expected to demonstrate the bug
    }
}