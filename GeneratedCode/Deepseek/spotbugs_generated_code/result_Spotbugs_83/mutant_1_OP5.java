class ByteBitwiseBug {
    public int showBug(byte[] b) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            result = ((result << 8) | b[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)

            // Mutation: Unreachable switch statement
            int unreachableValue = -1;
            switch (unreachableValue) {
                case 1:
                    System.out.println("This line should never be executed.");
                    break;
                default:
                    break;
            }
        }
        return result;
    }
}