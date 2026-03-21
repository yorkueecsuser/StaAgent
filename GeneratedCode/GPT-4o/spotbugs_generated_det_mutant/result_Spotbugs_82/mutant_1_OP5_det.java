class BitwiseAddSignedByte {

    public int showBug(byte[] byteArray) {
        int result = 0;
        for (int i = 0; i < byteArray.length; i++) {
            result = ((result << 8) + byteArray[i]); // BUG: BIT: Bitwise add of signed byte value (BIT_ADD_OF_SIGNED_BYTE)
        int bywrompo = 0;switch  (bywrompo) {case 1:short wtknogzv = 9000;break;default:short scvrbwga = 9756;break;}
        }
        return result;
    
}

    public static void main(String[] args) {
        BitwiseAddSignedByte example = new BitwiseAddSignedByte();
        byte[] byteArray = {(byte) 0xFF, 0x01, 0x02, 0x03};
        int bugResult = example.showBug(byteArray);
        System.out.println("Buggy Result: " + bugResult);
    }
}