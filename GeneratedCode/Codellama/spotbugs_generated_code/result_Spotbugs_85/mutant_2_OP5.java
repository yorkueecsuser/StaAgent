class BitwiseBugExample {
  public static void showBug(int x) {
    int mask = 0x000F;
    int value = x & mask;
    if (value == 0x0001) {
      System.out.println("The value is odd");
    } else {
      System.out.println("The value is even");
    }

    // Unreachable switch statement mutant
    int condition = getCondition();
    switch (condition) {
      case 1:
        System.out.println("The value is odd");
        break;
      case 2:
        System.out.println("The value is even");
        break;
      default:
        System.out.println("The value is neither odd nor even");
        break;
    }
  }

  private static int getCondition() {
    return 0;
  }
}