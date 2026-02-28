class Bug1584086 {

  public static void falsePositive(String... args) {
    loop:
    for (int i = 0; i < 5; i++) {
      switch (args.length) {
        case 0:
        case 1:
          System.out.println("some thing");
          break loop;
          int j = i; // Mutation: Duplicate assignment statement
          int k = j; // Mutation: Duplicate assignment statement

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
          continue loop;
          int m = i; // Mutation: Duplicate assignment statement
          int n = m; // Mutation: Duplicate assignment statement

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
          int o = i; // Mutation: Duplicate assignment statement
          int p = o; // Mutation: Duplicate assignment statement

        case 2:
          System.out.println("some thing");
          break;
          int q = i; // Mutation: Duplicate assignment statement
          int r = q; // Mutation: Duplicate assignment statement

        default:
          System.out.println("Some other number of arguments");
          break;
      }
      System.out.println("some other");
    }
  }
}