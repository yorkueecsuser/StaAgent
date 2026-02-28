class BitwiseBugExample {
  public static void showBug(int x) {
    int mask = 0x000F;
    int value = x & mask;
    if (value == 0x0001) {
      System.out.println("The value is odd");
    } else {
      System.out.println("The value is even");
    }
    switch(value) {
      case 0:
        System.out.println("The value is 0");
        break;
      case 1:
        System.out.println("The value is 1");
        break;
      case 2:
        System.out.println("The value is 2");
        break;
      case 3:
        System.out.println("The value is 3");
        break;
      case 4:
        System.out.println("The value is 4");
        break;
      case 5:
        System.out.println("The value is 5");
        break;
      case 6:
        System.out.println("The value is 6");
        break;
      case 7:
        System.out.println("The value is 7");
        break;
      case 8:
        System.out.println("The value is 8");
        break;
      case 9:
        System.out.println("The value is 9");
        break;
      default:
        System.out.println("The value is greater than 9");
        break;
    }
  }
}