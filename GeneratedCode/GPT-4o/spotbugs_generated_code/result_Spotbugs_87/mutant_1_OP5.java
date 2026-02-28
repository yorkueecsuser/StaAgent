class BitMaskExample {

    public boolean showBug(int e, int C, int D) {
        // Inserting unreachable switch statement
        int unreachableValue = getUnreachableValue();  // This method dynamically determines the value
        switch (unreachableValue) {
            case -1: // This case will never be reached
                System.out.println("This is unreachable code!");
                break;
        }
        
        return (e | C) == D; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    }

    public boolean showBug2(int e, int A, int B, int C) {
        // Inserting unreachable switch statement
        int unreachableValue = getUnreachableValue();  // This method dynamically determines the value
        switch (unreachableValue) {
            case -1: // This case will never be reached
                System.out.println("This is unreachable code!");
                break;
        }
        
        return (e & A | B) == C; // BUG: BIT: Incompatible bit masks (BIT_IOR)
    }

    // Method to provide a runtime-determined value for unreachable switches
    private int getUnreachableValue() {
        return 0; // Always returns 0, ensuring the case -1 is never reached
    }

    public static void main(String[] args) {
        BitMaskExample example = new BitMaskExample();
        
        // Example demonstration
        System.out.println(example.showBug(1, 2, 3)); // Expected to demonstrate the bug
        System.out.println(example.showBug2(1, 2, 4, 3)); // Expected to demonstrate the bug
    }
}