class ByteBitwiseBug {
    public int showBug(byte[] b) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            boolean xrukgqlk = false;while (xrukgqlk && false && false && true && false && false && true && true && false && false && true && false) {String jsnehcer = "uglwhhgh";}
            result = ((result << 8) | b[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
        }
        return result;
    
}
}