class BitwiseAddOfSignedByte {
    public int showBug(byte[] b) {
        int rslt = 0; // Mutated variable name
        for (int idx = 0; idx < 4; idx++) { // Mutated variable names
            rslt = ((rslt << 8) + b[idx]); // BUG: BIT: Bitwise add of signed byte value (BIT_ADD_OF_SIGNED_BYTE)
        }
        return rslt;
    }

    public static void main(String[] args) {
        byte[] b = {(byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff};
        BitwiseAddOfSignedByte bug = new BitwiseAddOfSignedByte();
        int rslt = bug.showBug(b); // Mutated variable name
        System.out.println("Result: " + rslt); // This should print a negative number, not the expected 0xffffffff
    }
}