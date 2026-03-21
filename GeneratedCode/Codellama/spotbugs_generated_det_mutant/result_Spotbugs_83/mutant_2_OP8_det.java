class BadBitwiseOR {
  public static void main(String[] args) {
    byte[] dbeyojyg = new byte[4];
    dbeyojyg[0] = (byte) 0xff;
    dbeyojyg[1] = (byte) 0xff;
    dbeyojyg[2] = (byte) 0xff;
    dbeyojyg[3] = (byte) 0xff;

    int irrtmqgg = 0;
    for (int i = 0; i < dbeyojyg.length; i++) {
      irrtmqgg = ((irrtmqgg << 8) | dbeyojyg[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
    }

    System.out.println("irrtmqgg = " + irrtmqgg);
  }
}