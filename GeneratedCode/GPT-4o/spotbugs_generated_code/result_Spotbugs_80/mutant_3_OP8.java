class SignedByteComparison {

    public boolean compareSignedByte(byte a, int value) {
        // Incorrect comparison: Comparing a signed byte with a value outside its range
        return a > value; // BUG: INT: Bad comparison of signed byte (INT_BAD_COMPARISON_WITH_SIGNED_BYTE)
    }

    public boolean showBug(byte c, int value) {
        return compareSignedByte(c, value);
    }

    public static void main(String[] args) {
        SignedByteComparison d = new SignedByteComparison();
        byte e = 100;
        int f = 200;
        boolean g = d.showBug(e, f);
        System.out.println("Comparison result: " + g);
    }
}