class BitwiseAddOfSignedByte {
    public int showBug(byte[] b) {
        int result = 0;
        boolean unreachableCondition = getUnreachableCondition(); // Added for the unreachable if statement mutation
        if (unreachableCondition) {
            System.out.println("This line should never be reached.");
        }
        for (int i = 0; i < 4; i++) {
            result = ((result << 8) + b[i]); // Original bug remains: BIT: Bitwise add of signed byte value (BIT_ADD_OF_SIGNED_BYTE)
        }
        return result;
    }

    // This method always returns false to ensure the if statement is unreachable
    private boolean getUnreachableCondition() {
        return false;
    }

    public static void main(String[] args) {
        byte[] b = {(byte)0xff, (byte)0xff, (byte)0xff, (byte)0xff};
        BitwiseAddOfSignedByte bug = new BitwiseAddOfSignedByte();
        int result = bug.showBug(b);
        System.out.println("Result: " + result); // Still prints a negative number, not the expected 0xffffffff
    }
}