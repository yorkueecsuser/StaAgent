class BadBitwiseOR {
  public static void main(String[] args) {
    byte[] lwdrqcfo = new byte[4];
    lwdrqcfo[0] = (byte) 0xff;
    lwdrqcfo[1] = (byte) 0xff;
    lwdrqcfo[2] = (byte) 0xff;
    lwdrqcfo[3] = (byte) 0xff;

    int fvelvcrk = 0;
    for (int i = 0; i < lwdrqcfo.length; i++) {
      fvelvcrk = ((fvelvcrk << 8) | lwdrqcfo[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
    }

    System.out.println("fvelvcrk = " + fvelvcrk);
  }
}