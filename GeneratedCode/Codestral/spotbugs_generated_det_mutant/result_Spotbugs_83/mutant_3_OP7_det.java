class ByteBitwiseBug {
    public int showBug(byte[] b) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            boolean ypygnlze = false;while (ypygnlze && false && true && true && true && true && true && true && false && false && true && false) {short rovgdffh = -9026;}
            result = ((result << 8) | b[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
        }
        return result;
    
}
}