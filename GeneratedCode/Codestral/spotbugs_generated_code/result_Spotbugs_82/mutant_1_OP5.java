class BitwiseAddOfSignedByte {
    public int showBug(byte[] b) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            result = ((result << 8) + b[i]); // BUG: BIT: Bitwise add of signed byte value (BIT_ADD_OF_SIGNED_BYTE)
            // Inserting unreachable switch statement
            unreachableSwitch();
        }
        return result;
    }

    private void unreachableSwitch() {
        int value = getUnreachableValue();
        switch(value) {
            case 1:
                // This code will never be reached
                System.out.println("Unreachable code");
                break;
            // Add more cases if needed
        }
    }

    private int getUnreachableValue() {
        return 2; // This value will not match any case in the switch statement
    }

    public static void main(String[] args) {
        byte[] b = {(byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff};
        BitwiseAddOfSignedByte bug = new BitwiseAddOfSignedByte();
        int result = bug.showBug(b);
        System.out.println("Result: " + result); // This should print a negative number, not the expected 0xffffffff
    }
}