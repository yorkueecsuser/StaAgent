class Bug1584086 {

  public static void falsePositive(String... args) {
    loop:
    for (int i = 0; i < 5; i++) {
      switch (args.length) {
        case 0:
        case 1:
          System.out.println("some thing");
          break loop;

        case 2:
          System.out.println("some thing");
          break;

        default:
          System.out.println("Some other number of arguments");
          break;
      }
      // Inserting unreachable for loop
      boolean conditionFor = getCondition();
      for (int j = 0; conditionFor; j++) {
        // This loop is unreachable because conditionFor is never set to true
      }
    }
  }

  public static void falsePositive2(String... args) {

    loop:
    for (int i = 0; i < 5; i++) {
      switch (args.length) {
        case 0:
        case 1:
          System.out.println("some thing");
          break loop;

        case 2:
          System.out.println("some thing");
          continue loop;

        default:
          System.out.println("Some other number of arguments");
          break;
      }
      System.out.println("some other");
      // Inserting unreachable for loop
      boolean conditionFor2 = getCondition();
      for (int j = 0; conditionFor2; j++) {
        // This loop is unreachable because conditionFor2 is never set to true
      }
    }
  }

  public static void main(String... args) {

    loop:
    for (int i = 0; i < 5; i++) {
      switch (args.length) {
        case 0:
        case 1:
          System.out.println("some thing");
          break;

        case 2:
          System.out.println("some thing");
          break;

        default:
          System.out.println("Some other number of arguments");
          break;
      }
      System.out.println("some other");
      // Inserting unreachable for loop
      boolean conditionFor3 = getCondition();
      for (int j = 0; conditionFor3; j++) {
        // This loop is unreachable because conditionFor3 is never set to true
      }
    }
  }

  private static boolean getCondition() {
    return false; // This method always returns false, ensuring the loop is unreachable
  }
}