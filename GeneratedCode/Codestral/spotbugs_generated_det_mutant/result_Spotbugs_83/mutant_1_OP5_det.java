class ByteBitwiseBug {
    public int showBug(byte[] b) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            int ossiwccp = 0;switch  (ossiwccp) {case 1:long bwrxylso = -80714294;break;default:float dicxkuym = 249634950;break;}
            result = ((result << 8) | b[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
        }
        return result;
    
}
}