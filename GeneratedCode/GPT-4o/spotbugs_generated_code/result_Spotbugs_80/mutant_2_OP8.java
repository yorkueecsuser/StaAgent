class SignedByteComparison {

    public boolean compareSignedByte(byte b, int value) {
        // Incorrect comparison: Comparing a signed byte with a value outside its range
        return b > value; // BUG: INT: Bad comparison of signed byte (INT_BAD_COMPARISON_WITH_SIGNED_BYTE)
    }

    public boolean showBug(byte x, int value) { // Renamed variable 'b' to 'x'
        return compareSignedByte(x, value); // Use the renamed variable 'x'
    }

    public static void main(String[] args) {
        SignedByteComparison y = new SignedByteComparison(); // Renamed variable 'example' to 'y'
        byte b = 100;
        int z = 200; // Renamed variable 'value' to 'z'
        boolean result = y.showBug(b, z); // Use the renamed variables 'y' and 'z'
        System.out.println("Comparison result: " + result);
    }
}