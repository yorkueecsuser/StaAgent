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
        };
    lambda.run();

    // Mutant code
    Runnable mutantLambda =
        () -> {
          String z = methodThatMightReturnNull();

          // would expect findbugs warning about possible null dereferencing here
          boolean y = z.isEmpty();
          System.out.println(y);
        };
    mutantLambda.run();
  }
}