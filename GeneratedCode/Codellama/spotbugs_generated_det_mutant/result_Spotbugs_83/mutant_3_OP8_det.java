class BadBitwiseOR {
  public static void main(String[] args) {
    byte[] wcutoibb = new byte[4];
    wcutoibb[0] = (byte) 0xff;
    wcutoibb[1] = (byte) 0xff;
    wcutoibb[2] = (byte) 0xff;
    wcutoibb[3] = (byte) 0xff;

    int lvatbsfd = 0;
    for (int i = 0; i < wcutoibb.length; i++) {
      lvatbsfd = ((lvatbsfd << 8) | wcutoibb[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
    }

    System.out.println("lvatbsfd = " + lvatbsfd);
  }
}