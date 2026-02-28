class SignedByteComparison {

    public boolean compareSignedByte(byte b, int value) {
        // Incorrect comparison: Comparing a signed byte with a value outside its range
        return b > value; // BUG: INT: Bad comparison of signed byte (INT_BAD_COMPARISON_WITH_SIGNED_BYTE)
    }

    public boolean showBug(byte b, int value) {
        // Insert an unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("This is an unreachable loop.");
        }
        
        return compareSignedByte(b, value);
    }

    // Method to avoid compile-time constant
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