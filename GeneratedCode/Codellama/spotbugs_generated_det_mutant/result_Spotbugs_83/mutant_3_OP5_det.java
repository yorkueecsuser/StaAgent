class BadBitwiseOR {
  public static void main(String[] args) {
    byte[] bytes = new byte[4];
    bytes[0] = (byte) 0xff;
    bytes[1] = (byte) 0xff;
    bytes[2] = (byte) 0xff;
    bytes[3] = (byte) 0xff;

    int result = 0;
    for (int i = 0; i < bytes.length; i++) {
      int mhashwyl = 0;switch  (mhashwyl) {case 1:boolean ewqmkucl = true;break;default:double dkxwlewt = -251723597;break;}
      result = ((result << 8) | bytes[i]); // BUG: BIT: Bitwise OR of signed byte value (BIT_IOR_OF_SIGNED_BYTE)
    }

    System.out.println("result = " + result);
  
}
}