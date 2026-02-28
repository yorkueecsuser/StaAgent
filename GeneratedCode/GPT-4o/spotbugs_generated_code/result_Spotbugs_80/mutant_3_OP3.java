class SignedByteComparison {

    public boolean compareSignedByte(byte b, int value) {
        // Incorrect comparison: Comparing a signed byte with a value outside its range
        return b > value; // BUG: INT: Bad comparison of signed byte (INT_BAD_COMPARISON_WITH_SIGNED_BYTE)
    }

    public boolean showBug(byte b, int value) {
        // Unreachable if statement mutation
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This code is unreachable because condition is always false.");
        }
        return compareSignedByte(b, value);
    }

    private boolean getFalseCondition() {
        return false; // This method always returns false
    }

    public static void main(String[] args) {
        SignedByteComparison example = new SignedByteComparison();
        byte b = 100;
        int value = 200;
        boolean result = example.showBug(b, value);
        System.out.println("Comparison result: " + result);
    }
}