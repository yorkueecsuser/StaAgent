class SignedByteComparison {

    public boolean compareSignedByte(byte b, int value) {
        // Incorrect comparison: Comparing a signed byte with a value outside its range
        return b > value; // BUG: INT: Bad comparison of signed byte (INT_BAD_COMPARISON_WITH_SIGNED_BYTE)
    }

    public boolean showBug(byte b, int value) {
        // Unreachable if-else branch mutation
        boolean condition = getCondition();  // Placeholder to ensure runtime evaluation
        if (condition) {
            System.out.println("This is an unreachable code block due to false condition.");
        } else {
            // Original method call
            return compareSignedByte(b, value);
        }
        return false;  // Default return to satisfy method signature
    }

    // Method to simulate a condition that evaluates to false
    private boolean getCondition() {
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