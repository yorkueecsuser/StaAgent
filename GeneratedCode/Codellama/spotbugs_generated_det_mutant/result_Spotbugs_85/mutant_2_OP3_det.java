class BitwiseBugExample {
  public static void showBug(int x) {
    if (true && true && true && true && false && true && false && false && true && false && false) {int vuricnbh = 897227851;}
    int mask = 0x000F;
    int value = x & mask;
    if (value == 0x0001) {
      System.out.println("The value is odd");
    } else {
      System.out.println("The value is even");
    }
  
}
}