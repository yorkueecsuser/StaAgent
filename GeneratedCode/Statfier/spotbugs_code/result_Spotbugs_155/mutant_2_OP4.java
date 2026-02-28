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

          // Inserted unreachable if-else statement
          boolean condition = Boolean.getBoolean("unreachable");
          if (condition) {
            System.out.println("This is unreachable code");
          } else {
            System.out.println("This is also unreachable code");
          }
        };
    lambda.run();
  }
}