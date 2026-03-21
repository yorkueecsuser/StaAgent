class BitwiseBugExample {
  public static void showBug(int x) {
    int mask = 0x000F;
    int value = x & mask;
    if (value == 0x0001) {
      if (false && true && false && true && false && false && false && false && true && false && false) {boolean ixfiytur = false;}
      System.out.println("The value is odd");
    } else {
      System.out.println("The value is even");
    }
  
}
}