import javax.annotation.CheckForNull;

class Issue20 {

  /**
   * @return may be null
   */
  @CheckForNull
  public static String methodThatMightReturnNull() {
    if (Boolean.getBoolean("test")) {
      return null;
    }

    return "test";
  }

  public void testNPLambda() {
    Runnable lambda =
        () -> {
          String maybeNull = methodThatMightReturnNull();

          // would expect findbugs warning about possible null dereferencing here
          boolean empty = maybeNull.isEmpty();
          System.out.println(empty);

          // Unreachable switch statement mutation
          boolean condition = Boolean.getBoolean("unreachable");
          switch (condition) {
            case true:
              System.out.println("This is unreachable code");
              break;
            default:
              System.out.println("Default case of unreachable code");
              break;
          }
        };
    lambda.run();
  }
}