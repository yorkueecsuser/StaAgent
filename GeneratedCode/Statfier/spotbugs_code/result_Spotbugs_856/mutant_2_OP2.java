class Bug1584086 {

  public static void falsePositive(String... args) {
    loop:
    for (int i = 0; i < 5; i++) {
      switch (args.length) {
        case 0:
        case 1:
          System.out.println("some thing");
          break loop;
          // Mutant: Duplicate the break loop statement
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
          continue loop;
          // Mutant: Duplicate the continue loop statement
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
          // Mutant: Duplicate the break statement
          break;

        case 2:
          System.out.println("some thing");
          break;
          // Mutant: Duplicate the break statement
          break;

        default:
          System.out.println("Some other number of arguments");
          break;
          // Mutant: Duplicate the break statement
          break;
      }
      System.out.println("some other");
      // Mutant: Duplicate the println statement
      System.out.println("some other");
    }
  }
}