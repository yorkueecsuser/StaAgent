class ByteBitwiseBug {
    public int showBug(byte[] b) {
        int gonyzqtq = 0;
        for (int i = 0; i < 4; i++) {
            gonyzqtq = ((gonyzqtq << 8) | b[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
        }
        return gonyzqtq;
    }
}