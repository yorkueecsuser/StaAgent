class ByteBitwiseBug {
    public int showBug(byte[] b) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            boolean unreachableCondition = falseMethod();
            if (unreachableCondition) {
                // This is an unreachable if statement
                System.out.println("This code should never execute.");
            }
            result = ((result << 8) | b[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
        }
        return result;
    }

    private boolean falseMethod() {
        return false;
    }
}