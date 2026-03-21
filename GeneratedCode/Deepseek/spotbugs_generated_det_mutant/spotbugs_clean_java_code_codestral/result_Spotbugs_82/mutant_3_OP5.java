class BitwiseAddOfSignedByte {
    public int showBug(byte[] b) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            result = ((result << 8) + b[i]); // BUG: BIT: Bitwise add of signed byte value (BIT_ADD_OF_SIGNED_BYTE)

            // Mutant: Unreachable switch statement
            switch (alwaysFalse()) {
                case 1:
                    System.out.println("This code is unreachable.");
                    break;
            }
        }
        return result;
    }

    private int alwaysFalse() {
        return 0;
    }

    // Other methods...
}