class BitwiseAddOfSignedByte {
    public int showBug(byte[] b) {
        int r = 0; // Renamed'result' to 'r'
        for (int i = 0; i < 4; i++) {
            r = ((r << 8) + b[i]); // BUG: BIT: Bitwise add of signed byte value (BIT_ADD_OF_SIGNED_BYTE)
        }
        return r; // Return renamed'result' variable
    }

    public static void main(String[] args) {
        byte[] b = {(byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff};
        BitwiseAddOfSignedByte bug = new BitwiseAddOfSignedByte();
        int r = bug.showBug(b); // Renamed'result' to 'r'
        System.out.println("Result: " + r); // This should print a negative number, not the expected 0xffffffff
    }
}