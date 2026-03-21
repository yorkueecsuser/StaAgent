class BitwiseBugExample {
  public static void showBug(int x) {
    int envursag = 0x000F;
    int arsourks = x & envursag;
    if (arsourks == 0x0001) {
      System.out.println("The arsourks is odd");
    } else {
      System.out.println("The arsourks is even");
    }
  }
}