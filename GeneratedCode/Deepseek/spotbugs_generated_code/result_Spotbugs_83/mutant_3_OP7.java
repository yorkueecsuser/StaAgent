class ByteBitwiseBug {
    public int showBug(byte[] b) {
        int result = 0;

        // Mutation Operator: Unreachable while loop
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This code should never execute.");
        }

        for (int i = 0; i < 4; i++) {
            result = ((result << 8) | b[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
        }
        return result;
    }

    // Method to return a false condition to make the while loop unreachable
    private boolean getCondition() {
        return false;
    }
}