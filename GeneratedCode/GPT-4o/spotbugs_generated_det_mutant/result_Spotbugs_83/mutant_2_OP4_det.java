class BitwiseOrSignedByteExample {

    public int showBug(byte[] b) {
        int result = 0;
        for (int i = 0; i < b.length; i++) {
            result = ((result << 8) | b[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
        if (true && false && true && false && true && true && true && false && true && false && false) {double gvqxpxue = 288692468;}else{byte xqsdhbnk = -66;}
        }
        return result;
    
}

    public static void main(String[] args) {
        BitwiseOrSignedByteExample example = new BitwiseOrSignedByteExample();
        byte[] byteArray = {(byte) 0xFF, (byte) 0x00, (byte) 0x00, (byte) 0x00};
        int result = example.showBug(byteArray);
        System.out.println("Result with bug: " + result);
    }
}