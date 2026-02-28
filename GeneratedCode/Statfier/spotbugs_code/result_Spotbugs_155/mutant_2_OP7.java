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

          // Unreachable while loop mutation
          boolean conditionWhile = Boolean.getBoolean("unreachable");
          while (conditionWhile) {
            // This loop is intended to be unreachable
            System.out.println("This should never be printed");
          }

          // would expect findbugs warning about possible null dereferencing here
          boolean empty = maybeNull.isEmpty();
          System.out.println(empty);
        };
    lambda.run();
  }
}