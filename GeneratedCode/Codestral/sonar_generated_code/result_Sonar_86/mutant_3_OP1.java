class ByteShiftBug {
    public int showBug(byte b) {
        int shifted = b << 24;
        int deadStore; // This is a dead store. It is declared but never used.
        return shifted;
    }
}