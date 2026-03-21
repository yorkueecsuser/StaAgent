class BitwiseBugExample {
  public static void showBug(int x) {
    int ftziqvpu = 0x000F;
    int rsqzgctr = x & ftziqvpu;
    if (rsqzgctr == 0x0001) {
      System.out.println("The rsqzgctr is odd");
    } else {
      System.out.println("The rsqzgctr is even");
    }
  }
}