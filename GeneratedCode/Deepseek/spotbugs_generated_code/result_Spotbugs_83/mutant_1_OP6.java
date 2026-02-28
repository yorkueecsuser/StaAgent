class ByteBitwiseBug {
    public int showBug(byte[] b) {
        int result = 0;
        // Adding unreachable for loop
        boolean unreachableCondition = false;
        for (int j = 0; j < 1 && unreachableCondition; j++) {
            System.out.println("Unreachable code block");
        }

        for (int i = 0; i < 4; i++) {
            result = ((result << 8) | b[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
        }
        return result;
    }

    // Dummy method to return a false condition
    private boolean getCondition() {
        return false;
    }
}