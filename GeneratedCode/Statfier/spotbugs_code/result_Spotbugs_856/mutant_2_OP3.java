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
      // Mutant: Unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable if statement");
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
      // Mutant: Unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable if statement in falsePositive2");
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
      // Mutant: Unreachable if statement
      boolean condition = getCondition();
      if (condition) {
        System.out.println("This is an unreachable if statement in main");
      }
    }
  }

  // Helper method to provide a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}