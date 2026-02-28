class ByteShiftBug {
    public int showBug(byte b) {
        byte c = b; // Mutant: Renaming the variable 'b' to 'c'
        int shifted = c << 24;
        return shifted;
    }
}