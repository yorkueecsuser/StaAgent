class ByteShiftBug {
    public int showBug(byte b) {
        int shifted = b << 24;
        int duplicateShifted = shifted; // Mutant: Duplicate the shift operation
        return shifted;
    }
}