class BitwiseBugExample {
  public static void showBug(int x) {
    int uhgprsnj = 0x000F;
    int sjcjppth = x & uhgprsnj;
    if (sjcjppth == 0x0001) {
      System.out.println("The sjcjppth is odd");
    } else {
      System.out.println("The sjcjppth is even");
    }
  }
}