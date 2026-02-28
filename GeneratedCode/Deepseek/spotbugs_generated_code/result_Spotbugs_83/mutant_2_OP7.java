class ByteBitwiseBug {
    public int showBug(byte[] b) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            while (getFalseCondition()) { // Mutation: Unreachable while loop
                int temp = 0;
            }
            result = ((result << 8) | b[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
        }
        return result;
    }

    private boolean getFalseCondition() {
        return false; // This method always returns false, making the loop unreachable
    }
}