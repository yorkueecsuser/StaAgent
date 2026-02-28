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

          // Inserting an unreachable if-else branch
          boolean condition = Boolean.getBoolean("unreachable");
          if (condition) {
            System.out.println("This is reachable if 'unreachable' system property is true.");
          } else {
            System.out.println("This is also reachable if 'unreachable' system property is false.");
          }
        };
    lambda.run();
  }
}