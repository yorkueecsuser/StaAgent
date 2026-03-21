class BadBitwiseOR {
  public static void main(String[] args) {
    byte[] bytes = new byte[4];
    bytes[0] = (byte) 0xff;
    bytes[1] = (byte) 0xff;
    bytes[2] = (byte) 0xff;
    bytes[3] = (byte) 0xff;

    int result = 0;
    for (int i = 0; i < bytes.length; i++) {
      if (false && false && true && true && true && true && false && false && true && false && false) {int ynlqsayu = -560204227;}
      result = ((result << 8) | bytes[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
    }

    System.out.println("result = " + result);
  
}
}