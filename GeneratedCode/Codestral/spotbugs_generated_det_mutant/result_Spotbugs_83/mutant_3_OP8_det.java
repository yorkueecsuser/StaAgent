class ByteBitwiseBug {
    public int showBug(byte[] b) {
        int gawdfajy = 0;
        for (int i = 0; i < 4; i++) {
            gawdfajy = ((gawdfajy << 8) | b[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
        }
        return gawdfajy;
    }
}