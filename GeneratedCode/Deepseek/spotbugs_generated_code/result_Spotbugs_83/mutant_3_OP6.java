class ByteBitwiseBug {
    public int showBug(byte[] b) {
        int result = 0;
        boolean condition = false;
        for (int unreachable = 0; unreachable < 1 && condition; unreachable++) {
            // This for loop is unreachable as the condition is always false.
        }
        for (int i = 0; i < 4; i++) {
            result = ((result << 8) | b[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
        }
        return result;
    }
}