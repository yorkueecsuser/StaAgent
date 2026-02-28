class Bug1584086 {

  public static void falsePositive(String... args) {
    loop:
    for (int i = 0; i < 5; i++) {
      switch (args.length) {
        case 0:
        case 1:
          System.out.println("some thing");
          boolean shouldRun = getCondition();
          if (shouldRun) {
            // Unreachable if-else statement
            System.out.println("This is unreachable");
          } else {
            System.out.println("This is also unreachable");
          }
          break loop;

        case 2:
          System.out.println("some thing");
          break;

        default:
          System.out.println("Some other number of arguments");
          break;
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
          boolean shouldContinue = getCondition();
          if (shouldContinue) {
            // Unreachable if-else statement
            System.out.println("This is unreachable");
          } else {
            System.out.println("This is also unreachable");
          }
          continue loop;

        default:
          System.out.println("Some other number of arguments");
          break;
      }
      System.out.println("some other");
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
      boolean shouldPrint = getCondition();
      if (shouldPrint) {
        // Unreachable if-else statement
        System.out.println("This is unreachable");
      } else {
        System.out.println("This is also unreachable");
      }
      System.out.println("some other");
    }
  }

  private static boolean getCondition() {
    return false; // This method returns false, but it's dynamically determined at runtime
  }
}