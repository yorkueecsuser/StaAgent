class BitwiseAddOfSignedByte {
    public int showBug(byte[] b) {
        int result = 0;
        int i = 0;
        do {
            result = ((result << 8) + b[i]); // BUG: BIT: Bitwise add of signed byte value (BIT_ADD_OF_SIGNED_BYTE)
            i++;
        } while (i < 4);
        return result;
    }

    public static void main(String[] args) {
        byte[] b = {(byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff};
        BitwiseAddOfSignedByte bug = new BitwiseAddOfSignedByte();
        int result = bug.showBug(b);
        System.out.println("Result: " + result); // This should print a negative number, not the expected 0xffffffff
    }
}