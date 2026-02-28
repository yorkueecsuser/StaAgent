class BitwiseBugExample {
  public static void showBug(int x) {
    int mask = 0x000F;
    int value = x & mask;
    if (value == 0x0001) {
      System.out.println("The value is odd");
    } else {
      System.out.println("The value is even");
    }
    if (getCondition()) {
      // unreachable if-else branch
      if (false) {
        System.out.println("This branch is unreachable");
      } else {
        System.out.println("This branch is also unreachable");
      }
    }
  }

  private static boolean getCondition() {
    return false;
  }
}