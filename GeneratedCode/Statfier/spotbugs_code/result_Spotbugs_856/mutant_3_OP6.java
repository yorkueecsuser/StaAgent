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
      // Mutant: Inserting an unreachable for loop
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
      // Mutant: Inserting an unreachable for loop
      boolean conditionFor = getCondition();
      for (int j = 0; conditionFor; j++) {
        // This loop is unreachable because conditionFor is never set to true
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
      // Mutant: Inserting an unreachable for loop
      boolean conditionFor = getCondition();
      for (int j = 0; conditionFor; j++) {
        // This loop is unreachable because conditionFor is never set to true
      }
    }
  }

  // Helper method to simulate a dynamic condition
  private static boolean getCondition() {
    return false;
  }
}