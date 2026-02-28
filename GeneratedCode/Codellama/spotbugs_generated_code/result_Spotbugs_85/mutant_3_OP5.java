class BitwiseBugExample {
  public static void showBug(int x) {
    int mask = 0x000F;
    int value = x & mask;
    switch (0) {
      case 1:
        System.out.println("The value is odd");
        break;
      default:
        System.out.println("The value is even");
        break;
    }
  }
}