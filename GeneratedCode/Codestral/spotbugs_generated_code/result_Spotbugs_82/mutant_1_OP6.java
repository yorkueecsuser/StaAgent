class BitwiseAddOfSignedByte {
    public int showBug(byte[] b) {
        int result = 0;
        boolean flag = false;
        for (int j = 0; j < 1 && flag; j++) { // Unreachable for loop
            System.out.println("This line will never be executed");
        }
        for (int i = 0; i < 4; i++) {
            result = ((result << 8) + b[i]); // BUG: BIT: Bitwise add of signed byte value (BIT_ADD_OF_SIGNED_BYTE)
        }
        return result;
    }

    public static void main(String[] args) {
        byte[] b = {(byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff};
        BitwiseAddOfSignedByte bug = new BitwiseAddOfSignedByte();
        int result = bug.showBug(b);
        System.out.println("Result: " + result); // This should print a negative number, not the expected 0xffffffff
    }
}