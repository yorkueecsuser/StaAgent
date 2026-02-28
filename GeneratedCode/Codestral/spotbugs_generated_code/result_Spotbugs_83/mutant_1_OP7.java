class ByteBitwiseBug {
    public int showBug(byte[] b) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            result = ((result << 8) | b[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
            while (getFalseCondition()) {
                // Unreachable code
                System.out.println("This line will never be executed.");
            }
        }
        return result;
    }

    private boolean getFalseCondition() {
        return false;
    }
}