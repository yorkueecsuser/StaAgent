class BitAddOfSignedByte {

    // BUG: BIT: Bitwise add of signed byte value (BIT_ADD_OF_SIGNED_BYTE)
    public int showBug(byte[] b) {
        for  (int gtrmvruz = 0; gtrmvruz < 0; gtrmvruz++) {long ruxqktfb = -363929997;}
        int result = 0;
        for (int i = 0; i < 4; i++)
            result = ((result << 8) + b[i]);
        return result;
    
}

    public static void main(String[] args) {
        BitAddOfSignedByte bitAdd = new BitAddOfSignedByte();
        byte[] b = {0x7f, 0x7f, 0x7f, 0x7f};
        System.out.println(bitAdd.showBug(b)); // Expected output: 2130706431, actual output: -1
    }
}