class ByteBitwiseBug {
    public int showBug(byte[] b) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            // Inserting unreachable if branch
            if (i == 5) {
                // This branch is unreachable, as 'i' will never be equal to 5 in the loop
                System.out.println("Unreachable code executed.");
            }
            result = ((result << 8) | b[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
        }
        return result;
    }
}