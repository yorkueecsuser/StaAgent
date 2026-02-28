class SignedByteComparison {

    public boolean compareSignedByte(byte b, int value) {
        // Incorrect comparison: Comparing a signed byte with a value outside its range
        boolean isConditionMet = false; // A non-final variable to control the while loop
        while(isConditionMet) { // Unreachable while loop
            // This is unreachable
            System.out.println("This is unreachable code.");
        }
        return b > value; // BUG: INT: Bad comparison of signed byte (INT_BAD_COMPARISON_WITH_SIGNED_BYTE)
    }

    public boolean showBug(byte b, int value) {
        return compareSignedByte(b, value);
    }

    public static void main(String[] args) {
        SignedByteComparison example = new SignedByteComparison();
        byte b = 100;
        int value = 200;
        boolean result = example.showBug(b, value);
        System.out.println("Comparison result: " + result);
    }
}