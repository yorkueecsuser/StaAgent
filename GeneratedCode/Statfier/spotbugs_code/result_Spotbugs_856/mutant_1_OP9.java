class Bug1584086 {

  public static void falsePositive(String... args) {
    int i = 0;
    loop:
    do {
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
      i++;
    } while (i < 5);
  }

  public static void falsePositive2(String... args) {
    int i = 0;
    loop:
    do {
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
      i++;
    } while (i < 5);
  }

  public static void main(String... args) {
    int i = 0;
    do {
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
      i++;
    } while (i < 5);
  }
}