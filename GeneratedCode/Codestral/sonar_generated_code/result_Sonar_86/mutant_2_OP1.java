class ByteShiftBug {
    public int showBug(byte b) {
        int deadStoreVar = 5; // Added dead store variable
        int shifted = b << 24;
        return shifted;
    }
}