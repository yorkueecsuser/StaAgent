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
            // This loop is unreachable because the system property "unreachable" is not set to true
            System.out.println("This loop is unreachable");
          }

          // would expect findbugs warning about possible null dereferencing here
          boolean empty = maybeNull.isEmpty();
          System.out.println(empty);
        };
    lambda.run();
  }
}