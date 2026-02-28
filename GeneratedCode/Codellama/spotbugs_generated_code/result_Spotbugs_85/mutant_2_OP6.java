class BitwiseBugExample {
  public static void showBug(int x) {
    int mask = 0x000F;
    int value = x & mask;
    if (value == 0x0001) {
      System.out.println("The value is odd");
    } else {
      System.out.println("The value is even");
    }
    for (int i = 0; false; i++) {
      // Unreachable for loop
      System.out.println("This for loop is unreachable");
    }
  }
}