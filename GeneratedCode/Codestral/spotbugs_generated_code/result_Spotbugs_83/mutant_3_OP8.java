class ByteBitwiseBug {
    public int showBug(byte[] b) {
        int r = 0; // r is renamed from result
        for (int i = 0; i < 4; i++) {
            r = ((r << 8) | b[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
        }
        return r; // r is returned instead of result
    }
}