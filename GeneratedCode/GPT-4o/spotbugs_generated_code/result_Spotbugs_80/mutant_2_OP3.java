class SignedByteComparison {

    public boolean compareSignedByte(byte b, int value) {
        // Incorrect comparison: Comparing a signed byte with a value outside its range
        return b > value; // BUG: INT: Bad comparison of signed byte (INT_BAD_COMPARISON_WITH_SIGNED_BYTE)
    }

    public boolean showBug(byte b, int value) {
        // Inserting an unreachable if statement using a method call for condition
        boolean isUnreachable = getFalseCondition();
        if (isUnreachable) {
            System.out.println("This code is unreachable.");
        }
        return compareSignedByte(b, value);
    }

    // Method that always returns false to simulate an unreachable branch
    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        SignedByteComparison example = new SignedByteComparison();
        byte b = 100;
        int value = 200;
        boolean result = example.showBug(b, value);
        System.out.println("Comparison result: " + result);
    }
}