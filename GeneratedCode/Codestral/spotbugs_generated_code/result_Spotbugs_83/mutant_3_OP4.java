class ByteBitwiseBug {
    public int showBug(byte[] b) {
        int result = 0;
        boolean condition = false;
        for (int i = 0; i < 4; i++) {
            if (condition) {
                // Unreachable code for mutation
                System.out.println("This statement should never be printed.");
            } else {
                result = ((result << 8) | b[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
            }
        }
        return result;
    }

    // Dummy method to avoid compile-time constant usage
    private boolean getCondition() {
        return false;
    }
}