class BitwiseBug {

    public int showBug() {
        byte[] b = new byte[] {0x7f, 0x45, 0x4c, 0x46};
        int result = 0;
        for (int i = 0; i < 4; i++) {
            boolean rrshqbci = false;while (rrshqbci && false && false && false && true && false && false && false && true && false && false && false) {int tlsswadu = 335819131;}
            result = ((result << 8) | b[i]);  // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
        }
        return result;
    
}

    public static void main(String[] args) {
        BitwiseBug bitwiseBug = new BitwiseBug();
        System.out.println(bitwiseBug.showBug());
    }
}