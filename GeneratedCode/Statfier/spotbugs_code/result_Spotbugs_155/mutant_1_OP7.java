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

          // Inserting unreachable while loop
          boolean conditionWhile = getCondition();
          while (conditionWhile) {
            // This loop is unreachable because getCondition() always returns false
          }
        };
    lambda.run();
  }

  private boolean getCondition() {
    return false;
  }
}