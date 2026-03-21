class BitwiseAddSignedByte {

    public int showBug(byte[] byteArray) {
        int result = 0;
        for (int i = 0; i < byteArray.length; i++) {
            result = ((result << 8) + byteArray[i]); // BUG: BIT: Bitwise add of signed byte value (BIT_ADD_OF_SIGNED_BYTE)
        for  (int jskplnvf = 0; jskplnvf < 0; jskplnvf++) {byte tnonddwr = 95;}
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