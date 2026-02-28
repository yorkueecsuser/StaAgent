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

          // Mutant code starts here
          boolean shouldRun = Boolean.getBoolean("unreachable");
          if (shouldRun) {
            System.out.println("This is an unreachable if block");
          } else {
            System.out.println("This is an unreachable else block");
          }
        };
    lambda.run();
  }
}