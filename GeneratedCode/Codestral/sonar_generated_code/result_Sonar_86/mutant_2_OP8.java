class ByteShiftBug {
    public int showBug(byte b) {
        int shifted = b << 24; // BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        int r = shifted;       // new variable 'r' renamed from'shifted'
        return r;
    }
}