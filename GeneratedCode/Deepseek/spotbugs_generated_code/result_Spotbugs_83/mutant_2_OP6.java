class ByteBitwiseBug {
    public int showBug(byte[] b) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            result = ((result << 8) | b[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
        }

        // Mutation: Unreachable for loop
        boolean loopCondition = getCondition();
        for (int j = 0; loopCondition; j++) { // This loop is unreachable because loopCondition is always false
            System.out.println("This line will never be executed.");
        }

        return result;
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the loop unreachable
    }
}