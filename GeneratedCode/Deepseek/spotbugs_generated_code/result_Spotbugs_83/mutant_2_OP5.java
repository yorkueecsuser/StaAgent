class ByteBitwiseBug {
    public int showBug(byte[] b) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            result = ((result << 8) | b[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
            mutantCode(i); // Mutant code
        }
        return result;
    }

    private void mutantCode(int i) {
        boolean shouldSwitch = false; // Always false to make the switch statement unreachable
        if (shouldSwitch) {
            switch (i) {
                case 1:
                    // This section of the code is unreachable
                    System.out.println("Unreachable code");
                    break;
                default:
                    // Default case does not contain any code
                    break;
            }
        }
    }
}