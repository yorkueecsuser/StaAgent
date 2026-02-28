class BitwiseAddOfSignedByte {
    public int showBug(byte[] b) {
        int res = 0; // Mutated variable name
        for (int i = 0; i < 4; i++) {
            res = ((res << 8) + b[i]); // BUG: BIT: Bitwise add of signed byte value (BIT_ADD_OF_SIGNED_BYTE)
        }
        return res; // Return mutated variable name
    }

    public static void main(String[] args) {
        byte[] arr = {(byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff}; // Mutated array name
        BitwiseAddOfSignedByte bug = new BitwiseAddOfSignedByte();
        int result = bug.showBug(arr); // Using mutated array name
        System.out.println("Result: " + result); // This should print a negative number, not the expected 0xffffffff
    }
}