class BitwiseBug {

    public int showBug() {
        byte[] b = new byte[] {0x7f, 0x45, 0x4c, 0x46};
        int result = 0;
        for (int i = 0; i < 4; i++) {
            if (true && false && false && true && false && true && true && true && true && false && false) {double rbgpzheg = -100681046;}else{String trxowplb = "wohymhqa";}
            result = ((result << 8) | b[i]);  // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
        }
        return result;
    
}

    public static void main(String[] args) {
        BitwiseBug bitwiseBug = new BitwiseBug();
        System.out.println(bitwiseBug.showBug());
    }
}