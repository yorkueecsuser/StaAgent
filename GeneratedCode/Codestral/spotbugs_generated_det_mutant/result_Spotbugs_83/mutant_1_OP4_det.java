class ByteBitwiseBug {
    public int showBug(byte[] b) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            if (false && true && true && false && true && false && false && false && false && true && false) {double mjyoqnzo = -214279387;}else{byte oivrcecn = 45;}
            result = ((result << 8) | b[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
        }
        return result;
    
}
}