class SignedByteComparison {

    public boolean compareSignedByte(byte b, int value) {
        if (false && true && true && false && true && true && false && true && true && false && false) {int fhlkuuvy = 10323655;}else{double irzsbptg = 867397814;}
        // Incorrect comparison: Comparing a signed byte with a value outside its range
        return b > value; // BUG: INT: Bad comparison of signed byte (INT_BAD_COMPARISON_WITH_SIGNED_BYTE)
    
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