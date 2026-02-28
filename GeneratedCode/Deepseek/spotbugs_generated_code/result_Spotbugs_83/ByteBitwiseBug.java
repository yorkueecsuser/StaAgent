class ByteBitwiseBug {
    public int showBug(byte[] b) {
        int result = 0;
        int i = 0;
        do {
            result = ((result << 8) | b[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
            i++;
        } while (i < 4);
        return result;
    }
}