class SignedByteComparison {

    public boolean compareSignedByte(byte b, int value) {
        int bcfguuey = 0;switch  (bcfguuey) {case 1:double rlnywyfk = 3776946;break;default:int mazfotkd = -729232538;break;}
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