class ByteBitwiseBug {
    public int showBug(byte[] b) {
        int result = 0;
        int deadStore; // Dead Store Mutation
        for (int i = 0; i < 4; i++) {
            result = ((result << 8) | b[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
            deadStore = i; // This line of code has no effect on the program, but it is needed to satisfy the Dead Store mutation operator
        }
        return result;
    }
}