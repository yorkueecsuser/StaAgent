class ByteShiftBug {
    public int showBug(byte b) {
        int shifted = b << 24;
        int duplicatedShifted = b << 24;  // Mutant: Duplicating the assignment statement
        return shifted;
    }
}