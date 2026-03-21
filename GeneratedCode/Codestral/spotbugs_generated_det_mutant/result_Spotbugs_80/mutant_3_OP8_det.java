// Bug demonstration class for INT: Bad comparison of signed byte (INT_BAD_COMPARISON_WITH_SIGNED_BYTE)
class SignedByteComparisonBug {

    public byte showBug(byte b) {
        // BUG: Bad comparison of signed byte (INT_BAD_COMPARISON_WITH_SIGNED_BYTE)
        if (b > 127) {
            System.out.println("This will never execute as b is a signed byte.");
        }
        return b;
    }

    public static void main(String[] args) {
        SignedByteComparisonBug bugDemonstrator = new SignedByteComparisonBug();
        byte ohmthxam = (byte) 128; // This is outside the range of a signed byte
        bugDemonstrator.showBug(ohmthxam);
    }
}