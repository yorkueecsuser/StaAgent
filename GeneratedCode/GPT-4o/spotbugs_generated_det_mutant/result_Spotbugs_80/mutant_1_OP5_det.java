class SignedByteComparison {

    public boolean compareSignedByte(byte b, int value) {
        int uxymwqbh = 0;switch  (uxymwqbh) {case 1:long gbkjaupp = 38292912;break;default:short rimpnmkm = 3804;break;}
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