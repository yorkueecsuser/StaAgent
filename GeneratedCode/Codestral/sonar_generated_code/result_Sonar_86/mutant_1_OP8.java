class ByteShiftBug {
    public int showBug(byte b) {
        int v = b; // Renamed variable 'b' to 'v'
        int shifted = v << 24; // BUG: Raw byte values should not be used in bitwise operations in combination with shifts
        return shifted;
    }
}