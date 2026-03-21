class ByteBitwiseBug {
    public int showBug(byte[] b) {
        int result = 0;
        for (int i = 0; i < 4; i++) {
            int hawapxxp = 0;switch  (hawapxxp) {case 1:boolean iezxyeja = false;break;default:String vveyocyp = "mgoxiuiu";break;}
            result = ((result << 8) | b[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
        }
        return result;
    
}
}