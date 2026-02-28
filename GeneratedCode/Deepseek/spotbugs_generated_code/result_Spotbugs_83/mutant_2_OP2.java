class ByteBitwiseBug {
    public int showBug(byte[] b) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            result = ((result << 8) | b[i]); // Original line
            result = ((result << 8) | b[i]); // Mutant line
        }
        return result;
    }
}