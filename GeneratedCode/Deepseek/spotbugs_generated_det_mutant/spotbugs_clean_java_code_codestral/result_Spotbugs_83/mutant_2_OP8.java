class ByteBitwiseBug {
    public int showBug(byte[] b) {
        int result = 0;
        for (int j = 0; j < 4; j++) {
            result = ((result << 8) | b[j]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
        }
        return result;
    }
}